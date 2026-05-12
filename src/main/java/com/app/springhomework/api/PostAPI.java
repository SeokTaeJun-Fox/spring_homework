package com.app.springhomework.api;

import com.app.springhomework.domain.dto.*;
import com.app.springhomework.service.PostService;
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
@RequestMapping("/api/posts") //Rest api에서 /.*을 쓰지 않는게 좋다
@Slf4j
public class PostAPI {

    private final PostService postService;

    //게시글 작성
    @PostMapping("/write")
    @Operation(summary = "게시글 작성 서비스", description = "게시글을 작성하는 서비스")
    @ApiResponse(responseCode = "201", description = "게시글 작성 완료")
    @ApiResponse(responseCode = "400", description = "잘못된 요청")
    public ResponseEntity<ApiResponseDTO> writePost(@RequestBody PostWriteRequestDTO postWriteRequestDTO) {
        postService.writePost(postWriteRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponseDTO.of("게시글 작성 성공"));
    }

    //게시글 수정
    @PutMapping("")
    @Operation(summary = "게시판 수정", description = "해당 번호의 게시글 내용을 변경해주는 서비스")
    @ApiResponse(responseCode = "200", description = "게시글 수정 완료")
    @ApiResponse(responseCode = "404", description = "게시글 없음")
    public ResponseEntity<ApiResponseDTO> modifyPost(@RequestBody PostUpdateRequestDTO postUpdateRequestDTO) {
        postService.updatePost(postUpdateRequestDTO);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 수정 성공"));
    }

    //게시글 목록
    @GetMapping("/list")
    @Operation(summary = "게시글 목록 조회 서비스", description = "게시글 목록을 조회해서 리스트로 반환하는 서비스")
    @ApiResponse(responseCode = "200", description = "게시글 목록 조회 성공")
    @ApiResponse(responseCode = "404", description = "게시글 조회 실패")
    //무조건 이 타입으로 리턴한다.
    public ResponseEntity<ApiResponseDTO> getPostList() {
        List<PostListResponseDTO> postList = postService.findAllPost();
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 목록 조회 성공", postList));
    }

    //게시글 조회
    @GetMapping("/{id}")
    @Operation(summary = "게시글 조회 서비스", description = "게시글 조회해서 게시글을 반환하는 서비스")
    @ApiResponse(responseCode = "200", description = "게시글 조회 성공")
    @ApiResponse(responseCode = "404", description = "게시글 조회 실패")
    @Parameter(
            name = "id",
            description = "게시글 번호",
            required = true,
            in = ParameterIn.PATH,
            example = "1",
            schema = @Schema(type = "number") // 스키마 타입
    )
    public ResponseEntity<ApiResponseDTO> getPostInfo(@PathVariable Long id) {
        PostDetailResponseDTO postDetailResponseDTO = postService.readPostDetail(id);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 조회 성공", postDetailResponseDTO));
    }

    //게시글 삭제
    @DeleteMapping("/{id}")
    @Operation(summary = "게시글 삭제 서비스", description = "post아이디로 게시글을 삭제하는 서비스")
    @ApiResponse(responseCode = "200", description = "게시글 삭제 완료")
    @ApiResponse(responseCode = "404", description = "게시글 없음")
    @Parameter(
            name = "id",
            description = "게시글 번호",
            required = true,
            in = ParameterIn.PATH,
            example = "1",
            schema = @Schema(type = "number") // 스키마 타입
    )
    public ResponseEntity<ApiResponseDTO> deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("게시글 삭제 성공"));
    }
}
