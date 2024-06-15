package co.com.ps.C23A.service;

import co.com.ps.C23A.domain.Products;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService implements IProductService {
    @Override
    public Products findById(Long IdProduct) {
        return null;
    }

    @Override
    public Products findByName(String name) {
        return null;
    }

    @Override
    public List<Products> findAll() {
        return List.of();
    }

    @Override
    public Products save(Products products) {
        return null;
    }

    @Override
    public Products update(Products products) {
        return null;
    }

    @Override
    public void delete(Long idProduct) {
    }
}
