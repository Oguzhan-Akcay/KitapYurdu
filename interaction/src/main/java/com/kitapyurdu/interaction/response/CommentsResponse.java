package com.kitapyurdu.interaction.response;

import com.kitapyurdu.interaction.dto.CommentsDto;

import java.io.Serializable;

public class CommentsResponse extends BaseResponse implements Serializable {
    public CommentsDto commentsDto;
}
