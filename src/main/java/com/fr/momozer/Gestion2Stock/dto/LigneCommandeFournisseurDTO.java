package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Article;
import com.fr.momozer.Gestion2Stock.model.CommandeFournisseur;
import com.fr.momozer.Gestion2Stock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeFournisseurDTO {
    private Integer id;
    private ArticleDTO article;

    private CommandeFournisseurDTO commandeFournisseur;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public LigneCommandeFournisseurDTO fromEntity (LigneCommandeFournisseur ligneCommandeFournisseur) {
        if (ligneCommandeFournisseur == null) {
            return  null;
        }
        return LigneCommandeFournisseurDTO.builder()
                .id(ligneCommandeFournisseur.getId())
                .quantite(ligneCommandeFournisseur.getQuantite())
                .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
                .build();
    }

    public LigneCommandeFournisseur toEntity (LigneCommandeFournisseurDTO ligneCommandeFournisseurDTO) {
        if (ligneCommandeFournisseurDTO == null) {
             return null;
        }
        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setId(ligneCommandeFournisseurDTO.getId());
        ligneCommandeFournisseur.setQuantite(ligneCommandeFournisseurDTO.getQuantite());
        ligneCommandeFournisseur.setPrixUnitaire(ligneCommandeFournisseurDTO.getPrixUnitaire());

        return ligneCommandeFournisseur;
    }
}
