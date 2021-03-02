package com.kilopo.storefrontservice.service.impl;

import com.kilopo.storefrontservice.domain.Category;
import com.kilopo.storefrontservice.domain.Product;
import com.kilopo.storefrontservice.domain.ProductCatalog;
import com.kilopo.storefrontservice.domain.Promotion;
//import com.kilopo.storefrontservice.dto.EventDTO;
import com.kilopo.storefrontservice.dto.EventDTO;
import com.kilopo.storefrontservice.feign.PromotionClient;
import com.kilopo.storefrontservice.service.EventService;
import com.kilopo.storefrontservice.service.PromotionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Slf4j
public class PromotionServiceImpl implements PromotionService {

    private EventService eventService;
    private PromotionClient promotionClient;

    public ProductCatalog getProductCatalogWithPromotion(Product product) {
        Promotion promotion = promotionClient.getPromotionForProduct(product.getId());

        ProductCatalog productCatalog = new ProductCatalog(product.getId(), product, promotion);
        eventService.send(new EventDTO(productCatalog));
        return productCatalog;
    }


    public List<ProductCatalog> getProductCatalogs(Category category) {
        return category.getProducts().stream().map(this::getProductCatalogWithPromotion
        ).collect(Collectors.toList());
    }

}
