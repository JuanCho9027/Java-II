package co.com.ps.C23A.controller;

import co.com.ps.C23A.domain.Products;
import co.com.ps.C23A.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final IProductService productService;

    @GetMapping("/{id}")
    public Products getProductById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @GetMapping("/name/{name}")
    public Products getProductByName(@PathVariable String name) {
        return productService.findByName(name);
    }

    @GetMapping
    public List<Products> getAllProducts() {
        return productService.findAll();
    }

    @PostMapping
    public Products createProduct(@RequestBody Products products) {
        return productService.save(products);
    }

    @PutMapping("/{id}")
    public Products updateProduct(@PathVariable Long id, @RequestBody Products products) {
        products.setProductId(id);
        return productService.update(products);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.delete(id);
    }
}