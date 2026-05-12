package com.app.springhomework.api;

import com.app.springhomework.domain.dto.*;
import com.app.springhomework.service.PostService;
import com.app.springhomework.service.ReplyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/replys") //Rest api에서 /.*을 쓰지 않는게 좋다
@Slf4j
public class ReplyAPI {

    private final PostService postService;
    private final ReplyService replyService;

    //게시글 작성
    @PostMapping("/write")
    @Operation(summary = "댓글 작성 서비스", description = "댓글을 작성하는 서비스")
    @ApiResponse(responseCode = "201", description = "댓글 작성 완료")
    @ApiResponse(responseCode = "400", description = "잘못된 요청")
    public ResponseEntity<ApiResponseDTO> writePost(@RequestBody ReplyWriteRequestDTO replyWriteRequestDTO) {
        replyService.writeReply(replyWriteRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponseDTO.of("댓글 작성 성공"));
    }
}
