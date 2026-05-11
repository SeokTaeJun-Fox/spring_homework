package com.app.springhomework.domain.vo;

//ID                          NUMBER          CONSTRAINT PK_MEMBER PRIMARY KEY,
//MEMBER_EMAIL                VARCHAR2(255)   NOT NULL,
//MEMBER_NAME                 VARCHAR2(255)   NOT NULL

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MemberVO {
    private Long id;
    private String memberEmail;
    private String memberName;
}
