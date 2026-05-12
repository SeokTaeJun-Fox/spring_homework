package com.app.springhomework.repository;

import com.app.springhomework.domain.dto.*;
import com.app.springhomework.mapper.ReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReplyDAO {
    private final ReplyMapper replyMapper;

    public void save(ReplyWriteRequestDTO dto) {
        replyMapper.insert(dto);
    }

    public List<ReplyListResponseDTO> findAll(Long postId) {
        return replyMapper.selectById(postId);
    }

    public void deleteById(Long postId) {
        replyMapper.deleteByPostId(postId);
    }
}
