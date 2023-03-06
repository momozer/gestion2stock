package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.LigneVente;
import com.fr.momozer.Gestion2Stock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDTO {
    private Integer id;
    private VentesDTO vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public LigneVenteDTO fromEntity (LigneVente ligneVente) {
        if (ligneVente == null) {
            return null;
        }
        return LigneVenteDTO.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .build();
    }

    public LigneVente toEntity (LigneVenteDTO ligneVenteDTO) {
        if (ligneVenteDTO == null) {
            return null;
        }
        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDTO.getId());
        ligneVente.setQuantite(ligneVenteDTO.getQuantite());
        ligneVente.setPrixUnitaire(ligneVenteDTO.getPrixUnitaire());

        return ligneVente;
    }
}
