package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.LigneCommandeFournisseurDTO;

import java.util.ArrayList;
import java.util.List;

public class LigneCommandeFournisseurValidator {
    public static List<String> validate (LigneCommandeFournisseurDTO dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("Veuillez renseigner la quantite");
            errors.add("Veuillez renseigner le prix unitaire");
            return errors;
        }
        if (dto.getQuantite() == null) {
            errors.add("Veuillez renseigner la quantite");
        }
        if (dto.getPrixUnitaire() == null) {
            errors.add("Veuillez renseigner le prix unitaire");
        }
        return errors;
    }
}
