package com.fr.momozer.Gestion2Stock.controller;


import com.fr.momozer.Gestion2Stock.controller.api.ArticleApi;
import com.fr.momozer.Gestion2Stock.dto.ArticleDTO;
import com.fr.momozer.Gestion2Stock.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController implements ArticleApi {

    //Field injection
    @Autowired
    private ArticleService articleService;

    //Getter injection
    @Autowired
    public ArticleService getArticleService() {
        return articleService;
    }

    //constructor injection
    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Override
    public ArticleDTO save(ArticleDTO dto) {
        return articleService.save(dto);
    }

    @Override
    public ArticleDTO findById(Integer id) {
        return articleService.findById(id);
    }

    @Override
    public ArticleDTO findByCodeArticle(String codeArticle) {
        return articleService.findByCodeArticle(codeArticle);
    }

    @Override
    public List<ArticleDTO> findAll() {
        return articleService.findAll();
    }

    @Override
    public void delete(Integer id) {
        articleService.delete(id);
    }
}
