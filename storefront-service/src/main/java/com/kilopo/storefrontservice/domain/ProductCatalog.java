package com.kilopo.storefrontservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductCatalog {
    private Long id;
    private Product product;
    private Promotion promotion;

}
