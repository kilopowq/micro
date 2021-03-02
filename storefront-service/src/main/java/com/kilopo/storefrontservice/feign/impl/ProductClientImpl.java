package com.kilopo.storefrontservice.feign.impl;

import com.kilopo.storefrontservice.domain.Category;
import com.kilopo.storefrontservice.feign.ProductClient;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class ProductClientImpl implements ProductClient {

    @Override
    public Category getProducts(Long categoryId) {
        Category category = new Category();
        category.setId(categoryId);
        category.setProducts(Collections.emptyList());
        return category;
    }
}