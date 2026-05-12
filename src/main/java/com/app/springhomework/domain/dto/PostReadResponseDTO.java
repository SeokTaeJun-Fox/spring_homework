package com.app.springhomework.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(name = "게시글 단건 조회 응답 DTO", description = "게시글 단건 조회 시 반환되는 게시글 상세 정보")
public class PostReadResponseDTO {

    @Schema(description = "게시글 ID", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "게시글 제목", example = "스프링 공부 후기")
    private String postTitle;

    @Schema(description = "게시글 내용 (null 가능)", example = "오늘은 DTO 작성법을 배웠습니다.", nullable = true)
    private String postContent;

    @Schema(description = "조회수 (기본값 0, 서버 자동 관리)", example = "100", accessMode = Schema.AccessMode.READ_ONLY)
    private Long postReadCount;

    @Schema(description = "작성일시 (서버 자동 생성)", example = "2026-05-11 13:56:13.395000", accessMode = Schema.AccessMode.READ_ONLY)
    private String postCreatedAt;

    @Schema(description = "작성자 이름 (TBL_MEMBER.MEMBER_NAME)", example = "홍길동")
    private String memberName;

    @Schema(description = "작성자 이메일 (TBL_MEMBER.MEMBER_EMAIL)", example = "hong@example.com")
    private String memberEmail;
}
