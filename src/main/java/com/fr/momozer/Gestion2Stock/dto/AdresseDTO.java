package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
@Builder
@Data
public class AdresseDTO {

    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostal;

    private String pays;
// permet de mapper de l'entité vers le dto
    public static AdresseDTO fromEntity(Adresse adresse) {
        if (adresse == null) {
            return null;
        }
        return AdresseDTO.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostal(adresse.getCodePostal())
                .ville(adresse.getVille())
                .pays(adresse.getPays())
                .build();
    }
    // permet de mapper du dto vers l'entité
    public Adresse toEntity (AdresseDTO adresseDTO) {
        if (adresseDTO == null) {
            return null;
        }
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDTO.getAdresse1());
        adresse.setAdresse2(adresseDTO.getAdresse2());
        adresse.setCodePostal(adresseDTO.getCodePostal());
        adresse.setVille(adresseDTO.getVille());
        adresse.setPays(adresseDTO.getPays());
        return adresse;
    }

}
