package com.kitapyurdu.interaction.service;

import com.kitapyurdu.interaction.api.StockFeignCallebleApi;
import com.kitapyurdu.interaction.dto.CommentsDto;
import com.kitapyurdu.interaction.entity.Comments;
import com.kitapyurdu.interaction.exception.AddCommentsException;
import com.kitapyurdu.interaction.mapper.CommentsMapper;
import com.kitapyurdu.interaction.repository.CommentRepository;
import com.kitapyurdu.interaction.response.CommentsResponse;
import com.kitapyurdu.interaction.response.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService {

    @Autowired
    CommentsMapper commentsMapper;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    StockFeignCallebleApi stockFeignCallebleApi;

    public ProductResponse findProductWithFeign(){
        return stockFeignCallebleApi.productFind("7");
    }

    public ProductResponse sorgu(){
       ProductResponse productResponse= stockFeignCallebleApi.productFind("7");
       return productResponse;
    }



}
