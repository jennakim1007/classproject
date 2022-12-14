package com.app.board.domain;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class BoardWriteRequest {

    private String title;

    private String writer;

    private String content;

    private MultipartFile formFile;

    public BoardDTO toBoardDTO(){
        return BoardDTO.builder().
                title(title).writer(writer).content(content).
                build();
    }

}
