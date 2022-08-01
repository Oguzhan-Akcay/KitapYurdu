package com.kitapyurdu.interaction.client;

import com.kitapyurdu.interaction.api.StockFeignCallebleApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "STOCK")
public interface StockFeignClient extends StockFeignCallebleApi {
}
