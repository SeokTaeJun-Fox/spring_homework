package com.app.springhomework.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(name = "댓글 작성 요청 DTO", description = "새 댓글 작성 시 전달하는 요청 데이터 (TBL_REPLY 기반)")
public class ReplyWriteRequestDTO {

    @Schema(description = "댓글 ID (SEQ_REPLY 시퀀스 자동 생성, 요청 시 불필요)", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "댓글 내용 (선택, null 허용)", example = "좋은 글이네요!")
    private String replyContent;

    @Schema(description = "댓글이 속한 게시글 ID (TBL_POST 참조)", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long postId;

    @Schema(description = "댓글 작성자 회원 ID (TBL_MEMBER 참조)", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
    private Long memberId;
}
