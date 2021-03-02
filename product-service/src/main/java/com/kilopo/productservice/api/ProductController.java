package com.kilopo.productservice.api;

import com.kilopo.productservice.domain.Category;
import com.kilopo.productservice.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/{categoryId}")
    public Category getProducts(@PathVariable Long categoryId) {

        List<Product> products = Arrays.asList(
                new Product((long) 1, "Test 1 product", "Some 1 description", 534.25, (long) 1),
                new Product((long) 2, "Test 2 product", "Some 2 description", 41.25, (long) 1),
                new Product((long) 3, "Test 3 product", "Some 3 description", 456.25, (long) 2),
                new Product((long) 4, "Test 4 product", "Some 4 description", 76.25, (long) 3),
                new Product((long) 5, "Test 5 product", "Some 5 description", 31.25, (long) 2),
                new Product((long) 6, "Test 6 product", "Some 6 description", 63.25, (long) 3)
        );

        List<Product> categoryProducts = products.stream()
                .filter(product -> product.getCategoryId().equals(categoryId))
                .collect(Collectors.toList());

        return new Category(categoryId, categoryProducts);
    }
}
