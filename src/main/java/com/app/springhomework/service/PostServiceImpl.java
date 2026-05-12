package com.app.springhomework.service;

import com.app.springhomework.domain.dto.*;
import com.app.springhomework.exception.PostException;
import com.app.springhomework.repository.PostDAO;
import com.app.springhomework.repository.ReplyDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostDAO postDAO;
    private final ReplyDAO replyDAO;

    @Override
    public void writePost(PostWriteRequestDTO postWriteRequestDTO) {
        postDAO.save(postWriteRequestDTO);
    }

    @Override
    public void updatePost(PostUpdateRequestDTO postUpdateRequestDTO) {
        postDAO.update(postUpdateRequestDTO);
    }

    @Override
    public List<PostListResponseDTO> findAllPost() {
        return postDAO.findAll();
    }

    @Override
    public PostReadResponseDTO readPost(long id) {
        increasePostReadCount(id);
        return postDAO.findByID(id).orElseThrow(() -> new PostException("게시글이 존재하지 않습니다.", HttpStatus.NOT_FOUND));
    }



    @Override
    public void increasePostReadCount(long id) {
        postDAO.increasePostReadCount(id);
    }

    @Override
    public void deletePost(long id) {
        //게시글이 삭제되기전에 게시글의 댓글이 먼저 삭제되어야한다. (참조 무결성)
        replyDAO.deleteById(id);
        postDAO.deletePost(id);
    }

    @Override
    public PostDetailResponseDTO readPostDetail(long postId) {
        PostDetailResponseDTO postDetailResponseDTO = new PostDetailResponseDTO();
        postDetailResponseDTO.setPostReadResponseDTO(readPost(postId));
        postDetailResponseDTO.setReplyList(replyDAO.findAll(postId));
        return postDetailResponseDTO;
    }
}
