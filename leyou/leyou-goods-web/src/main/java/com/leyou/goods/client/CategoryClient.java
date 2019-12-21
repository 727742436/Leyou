package com.leyou.goods.client;

import com.leyou.item.api.CateogoryApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("item-service")
public interface CategoryClient extends CateogoryApi {
}
