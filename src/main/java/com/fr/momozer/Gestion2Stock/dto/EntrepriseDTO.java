package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Adresse;
import com.fr.momozer.Gestion2Stock.model.Entreprise;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
@Builder
@Data
public class EntrepriseDTO {
    private Integer id;
    private String nom;

    private String description;

    private AdresseDTO adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    public EntrepriseDTO fromEntity (Entreprise entreprise) {
        if(entreprise == null) {
            return null;
        }
        return EntrepriseDTO.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .codeFiscal(entreprise.getCodeFiscal())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .build();
    }

    public Entreprise toEntity(EntrepriseDTO entrepriseDTO) {
        if(entrepriseDTO == null) {
            return null;
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDTO.getId());
        entreprise.setNom(entrepriseDTO.getNom());
        entreprise.setDescription(entrepriseDTO.getDescription());
        entreprise.setCodeFiscal(entrepriseDTO.getCodeFiscal());
        entreprise.setPhoto(entrepriseDTO.getPhoto());
        entreprise.setEmail(entrepriseDTO.getEmail());

        return entreprise;
    }
}
