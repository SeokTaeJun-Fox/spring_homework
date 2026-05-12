package com.app.springhomework.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(name = "게시글 수정 요청 DTO", description = "게시글 수정 시 전달하는 요청 데이터")
public class PostUpdateRequestDTO {

    @Schema(description = "수정할 게시글 ID", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long id;

    @Schema(description = "수정할 게시글 제목", example = "수정된 제목입니다.", requiredMode = Schema.RequiredMode.REQUIRED)
    private String postTitle;

    @Schema(description = "수정할 게시글 내용 (선택, null 허용)", example = "수정된 내용입니다.")
    private String postContent;
}

