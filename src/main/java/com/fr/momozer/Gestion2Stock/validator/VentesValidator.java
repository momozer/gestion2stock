package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.VentesDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class VentesValidator {
    public static List<String> validate (VentesDTO dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("veuillez renseigner le code de vente");
            errors.add("veuillez renseigner une date de vente");
            return errors;
        }
        if (!StringUtils.hasLength(dto.getCode())){
            errors.add("veuillez renseigner le code de vente");
        }
        if (dto.getDateVente() == null){
            errors.add("veuillez renseigner la date de vente");
        }
        return errors;

    }
}
