package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.RoleDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RoleValidator {

    public static List<String> validate (RoleDTO dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("veuillez renseigner le nom du rôle");
            errors.add("veuillez renseigner l'id du rôle");
            errors.add("veuillez renseigner un utilisateur");
            return errors;
        }

        if (!StringUtils.hasLength(dto.getRoleName())){
            errors.add("veuillez renseigner le nom du rôle");
        }
        if (dto.getId() == null) {
            errors.add("veuillez renseigner l'id du rôle");
        }
        if (dto.getUtilisateur() == null){
            errors.add("veuillez renseigner un utilisateur");
        }
        return errors;
    }
}
