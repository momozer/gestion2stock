package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Roles;
import com.fr.momozer.Gestion2Stock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.management.relation.Role;

@Data
@Builder
public class RoleDTO {
    private Integer id;
    private String roleName;

    private UtilisateurDTO utilisateur;

    public RoleDTO fromEntity (Roles role) {
        if (role == null) {
            return null;
        }
        return RoleDTO.builder()
                .id(role.getId())
                .roleName(role.getRoleName())
                .build();
    }

    public Roles toEntity (RoleDTO roleDTO) {
        if (roleDTO == null) {
            return  null;
        }
        Roles role = new Roles();
        role.setId(roleDTO.getId());
        role.setRoleName(roleDTO.getRoleName());

        return role;
    }
}
