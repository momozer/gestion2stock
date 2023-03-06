package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Adresse;
import com.fr.momozer.Gestion2Stock.model.CommandeFournisseur;
import com.fr.momozer.Gestion2Stock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class FournisseurDTO {
    private Integer id;
    private String nom;

    private String prenom;

    private AdresseDTO adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeFournisseurDTO> commandeFournisseurs;

    public FournisseurDTO fromEntity(Fournisseur fournisseur) {
        if (fournisseur == null) {
            return null;
        }
        return FournisseurDTO.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .numTel(fournisseur.getNumTel())
                .build();
    }

    public Fournisseur toEntity (FournisseurDTO fournisseurDTO) {
        if (fournisseurDTO == null) {
            return null;
        }
        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDTO.getId());
        fournisseur.setNom(fournisseurDTO.getNom());
        fournisseur.setPhoto(fournisseurDTO.getPhoto());
        fournisseur.setMail(fournisseurDTO.getMail());
        fournisseur.setNumTel(fournisseurDTO.getNumTel());

        return fournisseur;
    }

}
