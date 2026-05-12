package com.app.springhomework.service;

import com.app.springhomework.domain.dto.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReplyService {
    public void writeReply(ReplyWriteRequestDTO dto);
    public List<ReplyListResponseDTO> findAllReply(Long postId);
    public void deleteReplyAll(Long postId);
}
