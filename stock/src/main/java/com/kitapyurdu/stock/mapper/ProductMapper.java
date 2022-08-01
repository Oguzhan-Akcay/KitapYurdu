package com.kitapyurdu.stock.mapper;

import com.kitapyurdu.stock.dto.ProductDto;
import com.kitapyurdu.stock.entity.Product;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface ProductMapper extends IEntityMapper<ProductDto, Product> {
}
