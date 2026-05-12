package com.app.springhomework.domain.dto;

//ID              NUMBER          CONSTRAINT PK_REPLY PRIMARY KEY,
//REPLY_CONTENT   VARCHAR2(255)   NULL,
//REPLY_CREATED_AT TIMESTAMP       DEFAULT CURRENT_TIMESTAMP,
//POST_ID         NUMBER          NOT NULL,
//MEMBER_ID       NUMBER          NOT NULL,

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Schema(name = "댓글 목록 응답 DTO", description = "댓글 목록 조회 시 반환되는 개별 댓글 정보 (TBL_REPLY + TBL_MEMBER JOIN)")
public class ReplyListResponseDTO {

    @Schema(description = "댓글 ID (SEQ_REPLY 시퀀스 자동 생성)", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "댓글 내용 (null 가능)", example = "좋은 글이네요!", nullable = true)
    private String replyContent;

    @Schema(description = "댓글 작성일시 (서버 자동 생성)", example = "2026-05-11 13:56:13.395000", accessMode = Schema.AccessMode.READ_ONLY)
    private String replyCreatedAt;

    @Schema(description = "댓글이 속한 게시글 ID (TBL_POST 참조)", example = "10")
    private Long postId;

    @Schema(description = "댓글 작성자 이름 (TBL_MEMBER.MEMBER_NAME)", example = "홍길동")
    private String memberName;

    @Schema(description = "댓글 작성자 이메일 (TBL_MEMBER.MEMBER_EMAIL)", example = "hong@example.com")
    private String memberEmail;
}
