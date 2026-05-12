package com.app.springhomework.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(name = "게시글 작성 요청 DTO", description = "새 게시글 작성 시 전달하는 요청 데이터")
public class PostWriteRequestDTO {

    @Schema(description = "게시글 ID (자동 생성, 요청 시 불필요)", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "게시글 제목", example = "스프링 공부 후기", requiredMode = Schema.RequiredMode.REQUIRED)
    private String postTitle;

    @Schema(description = "게시글 제목", example = "스프링 공부 후기", requiredMode = Schema.RequiredMode.REQUIRED)
    private String postContent;

    @Schema(description = "작성자 회원 ID (TBL_MEMBER 참조)", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long memberId;
}
