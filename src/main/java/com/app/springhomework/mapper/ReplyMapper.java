package com.app.springhomework.mapper;

import com.app.springhomework.domain.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
    public void insert(ReplyWriteRequestDTO dto);
    public List<ReplyListResponseDTO> selectById(Long id);
    public void deleteByPostId(Long id);
}
