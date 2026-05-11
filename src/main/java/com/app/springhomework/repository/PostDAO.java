package com.app.springhomework.repository;

import com.app.springhomework.domain.dto.PostListResponseDTO;
import com.app.springhomework.domain.dto.PostUpdateRequestDTO;
import com.app.springhomework.domain.dto.PostWriteRequestDTO;
import com.app.springhomework.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostDAO {
    private final PostMapper postMapper;

    public void save(PostWriteRequestDTO postWriteRequestDTO) {
        postMapper.insert(postWriteRequestDTO);
    }

    public void update(PostUpdateRequestDTO postUpdateRequestDTO) {
        postMapper.update(postUpdateRequestDTO);
    }

    public List<PostListResponseDTO> findAll() {
        return postMapper.selectAll();
    }
}
