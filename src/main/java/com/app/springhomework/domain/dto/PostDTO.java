package com.app.springhomework.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(name = "게시글 DTO", description = "TBL_POST 테이블 기반 게시글 기본 정보")
public class PostDTO {

    @Schema(description = "게시글 ID (SEQ_POST 시퀀스 자동 생성)", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "게시글 제목", example = "스프링 공부 후기", requiredMode = Schema.RequiredMode.REQUIRED)
    private String postTitle;

    @Schema(description = "게시글 내용 (null 허용)", example = "오늘은 DTO 작성법을 배웠습니다.", nullable = true)
    private String postContent;

    @Schema(description = "작성자 회원 ID (TBL_MEMBER 참조)", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long memberId;

    @Schema(description = "조회수 (기본값 0, 서버 자동 관리)", example = "0", accessMode = Schema.AccessMode.READ_ONLY)
    private Long postReadCount;

    @Schema(description = "작성일시 (서버 자동 생성, DEFAULT CURRENT_TIMESTAMP)", example = "2026-05-11 13:56:13.395000", accessMode = Schema.AccessMode.READ_ONLY)
    private String postCreatedAt;
}
