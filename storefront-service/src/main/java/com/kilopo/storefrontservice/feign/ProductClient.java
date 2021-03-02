package com.kilopo.storefrontservice.feign;

import com.kilopo.storefrontservice.domain.Category;
import com.kilopo.storefrontservice.feign.impl.ProductClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "product-service", fallback = ProductClientImpl.class)
public interface ProductClient {

    @RequestMapping(method = RequestMethod.GET, value = "/products/{categoryId}")
    Category getProducts(@PathVariable Long categoryId);
}
