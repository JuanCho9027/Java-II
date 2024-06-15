package co.com.ps.C23A.service;

import co.com.ps.C23A.domain.Category;
import co.com.ps.C23A.domain.Products;
import java.util.List;

public interface IProductService {
    Products findById(Long IdProduct);
    Products findByName(String name);
    List<Products> findAll();
    Products save(Products products);
    Products update(Products products);
    void delete(Long idProduct);
}
