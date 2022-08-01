package com.kitapyurdu.interaction.api;


import com.kitapyurdu.interaction.response.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface StockFeignCallebleApi {
    @GetMapping({"/product/productFind/{productId}"})
    ProductResponse productFind(@PathVariable(value = "productId") String productId);

}
