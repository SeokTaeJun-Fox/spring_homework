package com.app.springhomework.domain.dto;

//ID              NUMBER          CONSTRAINT PK_REPLY PRIMARY KEY,
//REPLY_CONTENT   VARCHAR2(255)   NULL,
//REPLY_CREATED_AT TIMESTAMP       DEFAULT CURRENT_TIMESTAMP,
//POST_ID         NUMBER          NOT NULL,
//MEMBER_ID       NUMBER          NOT NULL,

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ReplyListResponseDTO {
    private Long id;
    private String replyContent;
    private String replyCreatedAt;
    private Long postId;
    private String memberName;
    private String memberEmail;
}
