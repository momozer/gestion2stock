package com.fr.momozer.Gestion2Stock.model;

import lombok.*;
import org.springframework.aop.IntroductionAwareMethodMatcher;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Article")
public class Article extends AbstractEntity {

    @Column(name = "codeArticle")
    private String codeArticle;

    @Column(name = "idEntreprise")
    private Integer idEntreprise;

    @Column(name = "designation")
    private String designation;

    @Column(name = "tauxTva")
    private BigDecimal tauxTva;

    @Column(name = "prixUnitaireHt")
    private BigDecimal prixUnitaireHt;

    @Column(name = "prixUnitaireTTC")
    private BigDecimal prixUnitaireTTC;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;
}
