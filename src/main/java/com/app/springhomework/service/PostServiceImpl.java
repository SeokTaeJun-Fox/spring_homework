package com.app.springhomework.service;

import com.app.springhomework.domain.dto.PostListResponseDTO;
import com.app.springhomework.domain.dto.PostUpdateRequestDTO;
import com.app.springhomework.domain.dto.PostWriteRequestDTO;
import com.app.springhomework.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostDAO postDAO;

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
}
