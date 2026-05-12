package com.app.springhomework.service;

import com.app.springhomework.domain.dto.PostWriteRequestDTO;
import com.app.springhomework.domain.dto.ReplyListResponseDTO;
import com.app.springhomework.domain.dto.ReplyWriteRequestDTO;
import com.app.springhomework.domain.vo.ReplyVO;
import com.app.springhomework.repository.ReplyDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    private final ReplyDAO replyDAO;

    @Override
    public void writeReply(ReplyWriteRequestDTO dto) {
        replyDAO.save(dto);
    }

    @Override
    public List<ReplyListResponseDTO> findAllReply(Long postId) {
        return replyDAO.findAll(postId);
    }

    @Override
    public void deleteReplyAll(Long postId) {
        replyDAO.deleteById(postId);
    }
}
