package com.app.springhomework;

import com.app.springhomework.domain.dto.PostUpdateRequestDTO;
import com.app.springhomework.domain.dto.PostWriteRequestDTO;
import com.app.springhomework.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class PostTests {

    @Autowired
    private PostService postService;

    @Test
    void postWriteTest() {
        PostWriteRequestDTO postWriteRequestDTO = new PostWriteRequestDTO();
        postWriteRequestDTO.setMemberId(1L);
        postWriteRequestDTO.setPostTitle("Post Title");
        postWriteRequestDTO.setPostContent("Post Content");
        postService.writePost(postWriteRequestDTO);
    }

    @Test
    void postUpdateTest() {
        PostUpdateRequestDTO postUpdateRequestDTO = new PostUpdateRequestDTO();
        postUpdateRequestDTO.setId(1L);
        postUpdateRequestDTO.setPostTitle("Update Title");
        postUpdateRequestDTO.setPostContent("Update Content");
        postService.updatePost(postUpdateRequestDTO);
    }

    @Test
    void postFindAllTest() {
        log.info("{}", postService.findAllPost());
    }
}
