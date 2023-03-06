package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.EntrepriseDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public static List<String> validate (EntrepriseDTO dto){
        List<String> errors = new ArrayList<>();
        if (dto  == null) {
            errors.add("veuillez renseigner le nom");
            errors.add("veuillez renseigner le code fiscal");
            errors.add("veuillez renseigner l'adresse email");
            return errors;
        }
        if (!StringUtils.hasLength(dto.getNom())){
            errors.add("veuillez renseigner le nom");
        }
        if (!StringUtils.hasLength(dto.getCodeFiscal())) {
            errors.add("veuillez renseigner le code fiscal");
        }
        if (!StringUtils.hasLength(dto.getEmail())) {
            errors.add("veuillez renseigner l'adresse email");
        }
        return errors;
    }
}
