package com.fr.momozer.Gestion2Stock.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Roles")
public class Roles extends  AbstractEntity {
    @Column(name = "roleName")
    private String roleName;
    @Column(name = "idEntreprise")
    private Integer idEntreprise;

    @Column(name = "idRole")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;
}
