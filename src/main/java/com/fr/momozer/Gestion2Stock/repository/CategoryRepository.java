package com.fr.momozer.Gestion2Stock.repository;
import com.fr.momozer.Gestion2Stock.model.Article;
import com.fr.momozer.Gestion2Stock.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    Optional<Category> findCategoryByCodeCategory(String codeCategory);
}
