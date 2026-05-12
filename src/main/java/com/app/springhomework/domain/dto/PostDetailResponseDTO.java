package com.app.springhomework.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@Schema(name = "게시글 상세 응답 DTO", description = "게시글 상세 조회 시 반환되는 게시글 정보와 댓글 목록 (TBL_POST + TBL_REPLY JOIN)")
public class PostDetailResponseDTO {

    @Schema(description = "게시글 단건 조회 정보 (TBL_POST 기반)")
    PostReadResponseDTO postReadResponseDTO;

    @Schema(description = "해당 게시글의 댓글 목록 (TBL_REPLY.POST_ID 기준)")
    List<ReplyListResponseDTO> replyList;
}
