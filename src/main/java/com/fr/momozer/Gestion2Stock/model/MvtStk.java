package com.fr.momozer.Gestion2Stock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "MvtStk")
public class MvtStk extends AbstractEntity {

    @Column(name = "dateMvt")
    private Instant dateMvt;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    @Column(name = "typeMvt")
    private TypeMvtStk typeMvtStk;
}
