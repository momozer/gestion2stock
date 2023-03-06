package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.CommandeClientDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandeClientValidator {
    public static List<String> validate (CommandeClientDTO dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("veuillez renseigner le code de la commande client");
            errors.add("veuillez renseigner la date de commande");
            return errors;
        }
        if (!StringUtils.hasLength(dto.getCode())){
            errors.add("veuillez renseigner le code de la commande client");
        }
        if (dto.getDateCommande() == null ){
            errors.add("veuillez renseigner la date de commande");
        }
        return errors;
    }
}
