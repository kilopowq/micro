package com.kilopo.storefrontservice.service.impl;

import com.kilopo.storefrontservice.domain.Category;
import com.kilopo.storefrontservice.feign.ProductClient;
import com.kilopo.storefrontservice.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@AllArgsConstructor
@Slf4j
public class ProductServiceImpl implements ProductService {

    private ProductClient productClient;

    public Category getCategory(@PathVariable Long categoryId) {
        return productClient.getProducts(categoryId);
    }
}
