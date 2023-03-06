package com.fr.momozer.Gestion2Stock.model;

import lombok.*;
import org.springframework.web.servlet.resource.AbstractVersionStrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Category")
public class Category extends AbstractEntity {

    @Column(name = "code")
    private String code;

    @Column(name = "idEntreprise")
    private Integer idEntreprise;

    @Column(name = "desgination")
    private String designation;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
