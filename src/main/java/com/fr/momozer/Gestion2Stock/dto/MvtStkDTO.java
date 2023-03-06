package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Article;
import com.fr.momozer.Gestion2Stock.model.MvtStk;
import com.fr.momozer.Gestion2Stock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDTO {
    private Integer id;
    private Instant dateMvt;

    private BigDecimal quantite;

    private ArticleDTO article;

    private TypeMvtStk typeMvtStk;

    public MvtStkDTO fromEntity (MvtStk mvtStk) {
        if (mvtStk == null) {
            return null;
        }
        return MvtStkDTO.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .build();
    }

    public MvtStk toEntity (MvtStkDTO mvtStkDTO) {
        if (mvtStkDTO == null) {
            return null;
        }
        MvtStk mvt = new MvtStk();
        mvt.setId(mvtStkDTO.getId());
        mvt.setDateMvt(mvtStkDTO.getDateMvt());
        mvt.setQuantite(mvtStkDTO.getQuantite());

        return mvt;
    }
}
