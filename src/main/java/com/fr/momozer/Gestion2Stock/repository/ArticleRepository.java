package com.fr.momozer.Gestion2Stock.repository;
import com.fr.momozer.Gestion2Stock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Integer> {

    Optional<Article> findArticleByCodeArticle(String codeArticle);



}
