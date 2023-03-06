package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Article;
import com.fr.momozer.Gestion2Stock.model.CommandeClient;
import com.fr.momozer.Gestion2Stock.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeClientDTO {
    private Integer id;
    private ArticleDTO article;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private CommandeClientDTO commandeClient;

    public LigneCommandeClientDTO fromEntity (LigneCommandeClient ligneCommandeClient) {
        if(ligneCommandeClient == null) {
            return null;
        }
        return LigneCommandeClientDTO.builder()
                .id(ligneCommandeClient.getId())
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .build();
    }

    public LigneCommandeClient toEntity (LigneCommandeClientDTO ligneCommandeClientDTO) {
        if (ligneCommandeClientDTO == null) {
            return null;
        }
        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient();
        ligneCommandeClient.setId(ligneCommandeClientDTO.getId());
        ligneCommandeClient.setQuantite(ligneCommandeClientDTO.getQuantite());
        ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDTO.getPrixUnitaire());

        return ligneCommandeClient;
    }

}
