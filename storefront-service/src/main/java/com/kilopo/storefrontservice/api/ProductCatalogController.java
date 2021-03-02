package com.kilopo.storefrontservice.api;

import com.kilopo.storefrontservice.domain.Category;
import com.kilopo.storefrontservice.domain.ProductCatalog;
import com.kilopo.storefrontservice.service.ProductService;
import com.kilopo.storefrontservice.service.PromotionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catalog")
@AllArgsConstructor
public class ProductCatalogController {

    private ProductService productService;
    private PromotionService promotionService;



    @GetMapping("/{categoryId}")
    public List<ProductCatalog> getProductsCatalog(@PathVariable Long categoryId) {
        Category category = productService.getCategory(categoryId);

        return promotionService.getProductCatalogs(category);
    }
}
