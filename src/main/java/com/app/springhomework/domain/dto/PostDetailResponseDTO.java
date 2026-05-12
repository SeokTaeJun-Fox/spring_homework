package com.app.springhomework.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class PostDetailResponseDTO {
    PostReadResponseDTO postReadResponseDTO;
    List<ReplyListResponseDTO> replyList;
}
