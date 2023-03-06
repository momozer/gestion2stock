package com.fr.momozer.Gestion2Stock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fr.momozer.Gestion2Stock.model.Article;
import com.fr.momozer.Gestion2Stock.model.Category;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;
@Builder
@Data
public class CategoryDTO {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDTO> articles;

    public static CategoryDTO fromEntity(Category category) {
        if(category == null) {
           return null;
            // todo throw an exception
        }
        // Category => CateoryDTO
        return CategoryDTO.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public static Category toEntity (CategoryDTO categoryDTO) {
        if (categoryDTO == null) {
            return null;
            //todo throw an exception
        }
        Category category = new Category();
        category.setId(categoryDTO.getId());
        category.setCode(categoryDTO.getCode());
        category.setDesignation(categoryDTO.getDesignation());

        return category;
    }
}
