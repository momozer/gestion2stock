package com.fr.momozer.Gestion2Stock.validator;

import com.fr.momozer.Gestion2Stock.dto.UtilisateurDTO;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate (UtilisateurDTO utilisateurDTO) {
        List<String> errors = new ArrayList<>();

        if (utilisateurDTO == null) {
            errors.add("Veuillez renseigner le nom d'utilisateur");
            errors.add("Veuillez renseigner le prenom d'utilisateur");
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
            errors.add("Veuillez renseigner l'email de l'utilisateur");
            errors.add("Veuillez renseigner la date de naissance");
            errors.add("Veuillez rensiegner l'adresse d'utilisateur");
            return errors;
        }

        if (!StringUtils.hasLength(utilisateurDTO.getNom())) {
            errors.add("Veuillez renseigner le nom d'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDTO.getPrenom())) {
            errors.add("Veuillez renseigner le prenom d'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDTO.getMotPasse())) {
            errors.add("Veuillez renseigner le mot de passe de l'utilisateur");
        }
        if (!StringUtils.hasLength(utilisateurDTO.getEmail())) {
            errors.add("Veuillez renseigner l'email de l'utilisateur");
        }
        if (utilisateurDTO.getDateNaissance() == null) {
            errors.add("Veuillez renseigner la date de naissance");
        }
        if (utilisateurDTO.getAdresse() == null) {
            errors.add("Veuillez rensiegner l'adresse d'utilisateur");
        }else {
            if (!StringUtils.hasLength(utilisateurDTO.getAdresse().getAdresse1())) {
                errors.add("L'adresse1 est obligatoire");
            }
            if (!StringUtils.hasLength(utilisateurDTO.getAdresse().getVille())) {
                errors.add("La ville est obligatoire");
            }
            if (!StringUtils.hasLength(utilisateurDTO.getAdresse().getCodePostal())) {
                errors.add("Le code postal est obligatoire");
            }
            if (!StringUtils.hasLength(utilisateurDTO.getAdresse().getPays())) {
                errors.add("Le pays est obligatoire");
            }
        }

        return errors;
    }
}
