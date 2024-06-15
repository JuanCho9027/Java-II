package co.com.ps.C23A.repository;


import co.com.ps.C23A.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    Optional<Category> findById(Long idCategory);

    Optional<Category> findByCategoryName(String name);

    List<Category> findAll();

    Category save(Category category);

    boolean existsById(Long categoryId);

    void deleteById(Long idCategory);
}
