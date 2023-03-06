package com.fr.momozer.Gestion2Stock.service;

import com.fr.momozer.Gestion2Stock.dto.ArticleDTO;
import com.fr.momozer.Gestion2Stock.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {

    CategoryDTO save (CategoryDTO dto);

    CategoryDTO findById(Integer id);

    CategoryDTO findByCodeCategory(String code);

    List<CategoryDTO> findAll();

    void delete(Integer id);
}
