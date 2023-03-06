package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.time.Instant;

@Data
@Builder
public class VentesDTO {
    private Integer id;
    private String code;

    private Instant dateVente;

    private String commentaire;

    public VentesDTO fromEntity (Ventes ventes){
        if (ventes == null){
            return null;
        }
        return VentesDTO.builder()
                .id(ventes.getId())
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .build();
    }

    public Ventes toEntity (VentesDTO ventesDTO) {
        if (ventesDTO == null) {
            return null;
        }
        Ventes v = new Ventes();
        v.setId(ventesDTO.getId());
        v.setCode(ventesDTO.getCode());
        v.setDateVente(ventesDTO.getDateVente());
        v.setCommentaire(ventesDTO.getCommentaire());

        return v;
    }
}
