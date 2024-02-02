package com.example.backend.products;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public Product saveProducts(Product product){
        return productService.saveProducts(product);
    }
    @GetMapping
    public List<Product>getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id){
        return productService.getProductById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
         productService.deleteProducts(id);
    }

}
