package com.fr.momozer.Gestion2Stock.service;
import com.fr.momozer.Gestion2Stock.dto.ArticleDTO;

import java.util.List;

public interface ArticleService {

    ArticleDTO save(ArticleDTO dto);

    ArticleDTO findById(Integer id);

    ArticleDTO findByCodeArticle( String codeArticle);

    List<ArticleDTO> findAll();

    void delete(Integer id);
}
