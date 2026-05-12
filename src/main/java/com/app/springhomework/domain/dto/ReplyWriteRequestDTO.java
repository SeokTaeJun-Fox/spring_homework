package com.app.springhomework.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ReplyWriteRequestDTO {
    private Long id;
    private String replyContent;
    private Long postId;
    private Long memberId;
}
