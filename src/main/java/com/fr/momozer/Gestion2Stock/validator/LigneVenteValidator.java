package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.LigneVenteDTO;

import java.util.ArrayList;
import java.util.List;

public class LigneVenteValidator {
    public static List<String> validate (LigneVenteDTO dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("veuillez renseigner une quantite");
            errors.add("veuillez renseigner un prix unitaire");
            return errors;
        }
        if (dto.getQuantite() == null) {
            errors.add("veuillez renseigner une quantite");
        }
        if (dto.getPrixUnitaire() == null) {
            errors.add("veuillez renseigner un prix unitaire");
        }
        return errors;
    }

}
