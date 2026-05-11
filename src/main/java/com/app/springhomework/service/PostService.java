package com.app.springhomework.service;

import com.app.springhomework.domain.dto.PostListResponseDTO;
import com.app.springhomework.domain.dto.PostUpdateRequestDTO;
import com.app.springhomework.domain.dto.PostWriteRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    public void writePost(PostWriteRequestDTO postWriteRequestDTO);
    public void updatePost(PostUpdateRequestDTO postUpdateRequestDTO);
    public List<PostListResponseDTO> findAllPost();
}
