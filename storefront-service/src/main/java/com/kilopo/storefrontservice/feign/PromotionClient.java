package com.kilopo.storefrontservice.feign;

import com.kilopo.storefrontservice.domain.Promotion;
import com.kilopo.storefrontservice.feign.impl.PromotionClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "promotion-service", fallback = PromotionClientImpl.class)
public interface PromotionClient {

    @RequestMapping(method = RequestMethod.GET, value = "/promotion/{productId}")
    Promotion getPromotionForProduct(@PathVariable Long productId);
}
