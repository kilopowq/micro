package com.kilopo.storefrontservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {
    private Long id;
    private String type;
    private Double value;
    private Long productId;
}
