package com.kilopo.promotionservice.api;

import com.kilopo.promotionservice.domain.Promotion;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/promotion")
public class PromotionController {
    int i = 0;
    @RequestMapping("/{productId}")
    public Promotion getPromotionForProduct(@PathVariable Long productId) throws InterruptedException {
        List<Promotion> promotions = Arrays.asList(
                new Promotion(1L, "Fix 1", 11, 1L),
                new Promotion(2L, "Fix 2", 22, 2L),
                new Promotion(3L, "Fix 3", 33, 3L),
                new Promotion(4L, "Fix 4", 44, 4L),
                new Promotion(5L, "Fix 5", 55, 5L),
                new Promotion(6L, "Fix 6", 66, 6L)
        );



        i++;
        if (i%5 == 0) {
//            Thread.sleep(5000);
            throw new RuntimeException();
        }

        return promotions.stream()
                .filter(promotion -> promotion.getProductId().equals(productId))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
