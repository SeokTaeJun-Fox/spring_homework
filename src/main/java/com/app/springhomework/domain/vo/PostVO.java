package com.app.springhomework.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

//ID              NUMBER          CONSTRAINT PK_POST PRIMARY KEY,
//POST_TITLE      VARCHAR2(255)   NOT NULL,
//POST_CONTENT    VARCHAR2(255)   NULL,
//POST_CREATED_AT  TIMESTAMP       DEFAULT CURRENT_TIMESTAMP,
//POST_READ_COUNT  NUMBER          DEFAULT 0 NOT NULL,
//MEMBER_ID       NUMBER          NOT NULL,

@Component
@Data
public class PostVO {
    private Long id;
    private String postTitle;
    private String postContent;
    private Long memberId;
    private Long postReadCount;
    private String postCreatedAt;
}
