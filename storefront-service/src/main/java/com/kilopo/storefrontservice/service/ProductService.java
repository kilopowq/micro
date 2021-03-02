package com.kilopo.storefrontservice.service;

import com.kilopo.storefrontservice.domain.Category;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {
    Category getCategory(@PathVariable Long categoryId);
}
