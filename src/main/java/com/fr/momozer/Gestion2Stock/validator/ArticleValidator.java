package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.ArticleDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate (ArticleDTO articleDTO) {
        List<String> errors = new ArrayList<>();

        if(articleDTO == null) {
            errors.add("Veuillez saisir la designation");
            errors.add("Veuillez saisir le prix unitaire hors taxe de l'article");
            errors.add("Veuillez saisir le taux de TVA de l'article");
            errors.add("Veuillez saisir le prix unitaire TTC de l'article");
            errors.add("Veuillez saisir la catégorie de l'article");
            return errors;
        }

        if (StringUtils.hasLength(articleDTO.getDesignation())){
            errors.add("Veuillez saisir la designation");
        }
        if (articleDTO.getPrixUnitaireHt() == null){
            errors.add("Veuillez saisir le prix unitaire hors taxe de l'article");
        }
        if (articleDTO.getTauxTva() == null){
            errors.add("Veuillez saisir le taux de TVA de l'article");
        }
        if (articleDTO.getPrixUnitaireTTC() == null) {
            errors.add("Veuillez saisir le prix unitaire TTC de l'article");
        }
        if (articleDTO.getCategory() == null) {
            errors.add("Veuillez saisir la catégorie de l'article");
        }
        return errors;


    }
}
