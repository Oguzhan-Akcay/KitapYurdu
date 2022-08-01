package com.kitapyurdu.interaction.controller;

import com.kitapyurdu.interaction.dto.CommentsDto;
import com.kitapyurdu.interaction.entity.Comments;
import com.kitapyurdu.interaction.exception.AddCommentsException;
import com.kitapyurdu.interaction.mapper.CommentsMapper;
import com.kitapyurdu.interaction.repository.CommentRepository;
import com.kitapyurdu.interaction.response.CommentsResponse;
import com.kitapyurdu.interaction.response.ProductResponse;
import com.kitapyurdu.interaction.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    CommentsService commentsService;
    @Autowired
    CommentsMapper commentsMapper;
    @Autowired
    CommentRepository commentRepository;


    @GetMapping("/find")
    public ProductResponse sorgu(){
        return commentsService.sorgu();
    }
}
