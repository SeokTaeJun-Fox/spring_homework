package com.app.springhomework.repository;

import com.app.springhomework.domain.dto.PostListResponseDTO;
import com.app.springhomework.domain.dto.PostReadResponseDTO;
import com.app.springhomework.domain.dto.PostUpdateRequestDTO;
import com.app.springhomework.domain.dto.PostWriteRequestDTO;
import com.app.springhomework.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    public Optional<PostReadResponseDTO> findByID(long id) {
        return Optional.ofNullable(postMapper.selectById(id));
    }

    public void increasePostReadCount(long id) {
        postMapper.updatePostReadCount(id);
    }

}
