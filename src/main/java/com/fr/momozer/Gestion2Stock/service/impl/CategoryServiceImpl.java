package com.fr.momozer.Gestion2Stock.service.impl;

import com.fr.momozer.Gestion2Stock.dto.CategoryDTO;
import com.fr.momozer.Gestion2Stock.exception.EntityNotFoundException;
import com.fr.momozer.Gestion2Stock.exception.ErrorCodes;
import com.fr.momozer.Gestion2Stock.exception.InvalidEntityException;
import com.fr.momozer.Gestion2Stock.model.Category;
import com.fr.momozer.Gestion2Stock.repository.CategoryRepository;
import com.fr.momozer.Gestion2Stock.service.CategoryService;
import com.fr.momozer.Gestion2Stock.validator.CategoryValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDTO save(CategoryDTO dto) {
        List<String> errors = CategoryValidator.validate(dto);
        if (!errors.isEmpty()){
            throw new InvalidEntityException("La category n'est pas valide",
                    ErrorCodes.ARTICLE_NOT_VALID);
        }

        return CategoryDTO.fromEntity(
                categoryRepository.save(CategoryDTO.toEntity(dto))
        );
    }

    @Override
    public CategoryDTO findById(Integer id) {

        Optional<Category> category = categoryRepository.findById(id);

        CategoryDTO dto = CategoryDTO.fromEntity(category.get());

        return Optional.of(dto).orElseThrow(() ->
                new EntityNotFoundException(
                        "Aucune category avec l'IDENTREPRISE " + id + " n'a été trouvé",
                        ErrorCodes.CATEGORY_NOT_FOUND
                ));
    }



    @Override
    public CategoryDTO findByCodeCategory(String code) {


        Optional<Category> category = categoryRepository.findCategoryByCodeCategory(code);


        return Optional.of(CategoryDTO.fromEntity(category.get())).orElseThrow(() ->
                new EntityNotFoundException(
                        "Aucune catégory avec le CODE = " + code + " n'a été trouvé",
                        ErrorCodes.CATEGORY_NOT_FOUND
                )) ;
    }

    @Override
    public List<CategoryDTO> findAll() {
        return categoryRepository.findAll().stream()
                .map(CategoryDTO::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }


}
