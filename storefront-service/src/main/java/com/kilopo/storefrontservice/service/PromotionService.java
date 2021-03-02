package com.kilopo.storefrontservice.service;

import com.kilopo.storefrontservice.domain.Category;
import com.kilopo.storefrontservice.domain.Product;
import com.kilopo.storefrontservice.domain.ProductCatalog;

import java.util.List;

public interface PromotionService {
    ProductCatalog getProductCatalogWithPromotion(Product product);
    List<ProductCatalog> getProductCatalogs(Category category);
}
