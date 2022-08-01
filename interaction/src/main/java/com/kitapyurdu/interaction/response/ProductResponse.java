package com.kitapyurdu.interaction.response;



import com.kitapyurdu.interaction.dto.ProductDto;

import java.io.Serializable;

public class ProductResponse extends BaseResponse implements Serializable {
    public ProductDto productDto;
}
