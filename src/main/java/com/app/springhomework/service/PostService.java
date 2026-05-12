package com.app.springhomework.service;

import com.app.springhomework.domain.dto.*;
import jakarta.servlet.http.PushBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    public void writePost(PostWriteRequestDTO postWriteRequestDTO);
    public void updatePost(PostUpdateRequestDTO postUpdateRequestDTO);
    public List<PostListResponseDTO> findAllPost();
    public PostReadResponseDTO readPost(long id);
    public void increasePostReadCount(long id);
    public void deletePost(long id);

    public PostDetailResponseDTO readPostDetail(long postId);
}
