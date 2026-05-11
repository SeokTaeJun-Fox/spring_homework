package com.app.springhomework.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PostWriteRequestDTO {
    private Long id;
    private String postTitle;
    private String postContent;
    private Long memberId;
}
