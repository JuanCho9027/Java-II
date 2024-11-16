package co.com.ps.C23A.service;

import co.com.ps.C23A.domain.Products;
import co.com.ps.C23A.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ProductService implements IProductService {

    private final ProductRepository productRepository;

    @Transactional(readOnly = true)
    @Override
    public Products findById(Long idProduct) {
        return productRepository.findById(idProduct)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + idProduct));
    }

    @Transactional(readOnly = true)
    @Override
    public Products findByName(String name) {
        return productRepository.findByProductName(name)
                .orElseThrow(() -> new RuntimeException("Product not found with name: " + name));
    }

    @Override
    public List<Products> findAll() {
        return productRepository.findAll();
    }

    @Transactional
    @Override
    public Products save(Products products) {
        return productRepository.save(products);
    }

    @Transactional
    @Override
    public Products update(Products products) {
        if (productRepository.existsById(products.getProductId())) {
            return productRepository.save(products);
        } else {
            throw new RuntimeException("Product not found with id: " + products.getProductId());
        }
    }

    @Transactional
    @Override
    public void delete(Long idProduct) {
        if (productRepository.existsById(idProduct)) {
            productRepository.deleteById(idProduct);
        } else {
            throw new RuntimeException("Product not found with id: " + idProduct);
        }
    }
}