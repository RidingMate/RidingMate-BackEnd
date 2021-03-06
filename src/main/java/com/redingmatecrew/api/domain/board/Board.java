package com.redingmatecrew.api.domain.board;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Board {

    private Long idx;

    @NonNull
    private BoardType boardType;

    // 게시글 번호
    @NonNull
    private Long postIdx;

    @NonNull
    private String title;

    @NonNull
    private String content;

    @NonNull
    private String createAt;
}
