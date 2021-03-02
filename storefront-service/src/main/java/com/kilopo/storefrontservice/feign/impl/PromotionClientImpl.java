package com.kilopo.storefrontservice.feign.impl;

import com.kilopo.storefrontservice.domain.Promotion;
import com.kilopo.storefrontservice.feign.PromotionClient;
import org.springframework.stereotype.Component;

@Component
public class PromotionClientImpl implements PromotionClient {

    @Override
    public Promotion getPromotionForProduct(Long productId) {
        Promotion promotion = new Promotion();
        promotion.setProductId(productId);
        promotion.setType("DEFAULT");
        promotion.setValue(0.0);
        return promotion;
    }
}
