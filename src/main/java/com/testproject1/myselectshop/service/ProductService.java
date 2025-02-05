package com.testproject1.myselectshop.service;

import com.testproject1.myselectshop.dto.ProductRequestDto;
import com.testproject1.myselectshop.dto.ProductResponseDto;
import com.testproject1.myselectshop.entity.Product;
import com.testproject1.myselectshop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        Product product = productRepository.save(new Product(requestDto));
        return new ProductResponseDto(product);
    }
}
