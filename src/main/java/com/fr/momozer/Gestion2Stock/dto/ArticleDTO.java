package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Article;
import com.fr.momozer.Gestion2Stock.model.Category;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
@Builder
@Data
public class ArticleDTO {

    private Integer id;
    private String codeArticle;


    private String designation;


    private BigDecimal tauxTva;


    private BigDecimal prixUnitaireHt;

    private BigDecimal prixUnitaireTTC;


    private String photo;


    private CategoryDTO category;

    public static ArticleDTO fromEntity(Article article) {
        if(article == null){
            return null;
        }
        return ArticleDTO.builder().build();
    }

    public static Article toEntity (ArticleDTO articleDTO) {
        if (articleDTO == null) {
            return null;
        }
        Article article = new Article();
        article.setPrixUnitaireHt(articleDTO.getPrixUnitaireHt());
        article.setPrixUnitaireTTC(articleDTO.getPrixUnitaireTTC());
        article.setTauxTva(articleDTO.getTauxTva());
        return article;
    }
}
