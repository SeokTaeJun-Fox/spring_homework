package com.app.springhomework.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class PostReadResponseDTO {
    private Long id;
    private String postTitle;
    private String postContent;
    private Long postReadCount;
    private String postCreatedAt;
    private String memberName;
    private String memberEmail;
}
