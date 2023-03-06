package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.ClientDTO;
import com.fr.momozer.Gestion2Stock.dto.FournisseurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {

    public static List<String> validate(FournisseurDTO fournisseurDTO) {
        List<String> errors = new ArrayList<>();

        if (fournisseurDTO == null) {
            errors.add("Veuillez renseigner le nom du client");
            errors.add("Veuillez renseigner le prenom du client");
            errors.add("Veuillez renseigner l'adresse du client'");
            errors.add("Veuillez renseigner le mail du client");
            errors.add("Veuillez renseigner le numéro de télephone du client");
            return errors;
        }

        if (!StringUtils.hasLength(fournisseurDTO.getNom())) {
            errors.add("Veuillez renseigner le nom du client");
        }
        if (!StringUtils.hasLength(fournisseurDTO.getPrenom())) {
            errors.add("Veuillez renseigner le prenom du client");
        }
        if (fournisseurDTO.getAdresse() == null) {
            errors.add("Veuillez renseigner l'adresse du client'");
        }
        if (!StringUtils.hasLength(fournisseurDTO.getMail())) {
            errors.add("Veuillez renseigner le mail du client");
        }
        if (!StringUtils.hasLength(fournisseurDTO.getNumTel())) {
            errors.add("Veuillez renseigner le numéro de télephone du client");
        }
        return errors;
    }
}
