package com.app.springhomework;

import com.app.springhomework.domain.dto.PostUpdateRequestDTO;
import com.app.springhomework.domain.dto.PostWriteRequestDTO;
import com.app.springhomework.domain.dto.ReplyWriteRequestDTO;
import com.app.springhomework.service.PostService;
import com.app.springhomework.service.ReplyService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class ReplyTests {

    @Autowired
    private ReplyService replyService;

    @Test
    void replyWriteTest() {
        int x = 21;
        int y = 5;

        for(int i = 21; i <= 40; i++) {
            for(int j = 0; j < 5; j++) {
                ReplyWriteRequestDTO replyWriteRequestDTO = new ReplyWriteRequestDTO();
                replyWriteRequestDTO.setReplyContent("reply content id: " + i + " num: " + j);
                replyWriteRequestDTO.setPostId((long) i);
                replyWriteRequestDTO.setMemberId(1L);
                replyService.writeReply(replyWriteRequestDTO);
            }
        }
    }

    @Test
    void replyFindAllTest() {
        log.info("{}", replyService.findAllReply(40L));
    }

    @Test
    void replyDeleteAllTest() {
        replyService.deleteReplyAll(31L);
    }
}
