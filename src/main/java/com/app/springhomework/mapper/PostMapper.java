package com.app.springhomework.mapper;

import com.app.springhomework.domain.dto.PostListResponseDTO;
import com.app.springhomework.domain.dto.PostReadResponseDTO;
import com.app.springhomework.domain.dto.PostUpdateRequestDTO;
import com.app.springhomework.domain.dto.PostWriteRequestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    public void insert(PostWriteRequestDTO postWriteRequestDTO);
    public void update(PostUpdateRequestDTO postUpdateRequestDTO);
    public List<PostListResponseDTO> selectAll();
    public PostReadResponseDTO selectById(Long id);
    public void updatePostReadCount(Long id);
}
