package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.Adresse;
import com.fr.momozer.Gestion2Stock.model.Entreprise;
import com.fr.momozer.Gestion2Stock.model.Roles;
import com.fr.momozer.Gestion2Stock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;
@Data
@Builder
public class UtilisateurDTO {
    private Integer id;
    private String nom;

    private String prenom;

    private String email;

    private Instant dateNaissance;

    private String motPasse;

    private AdresseDTO adresse;

    private String photo;

    private EntrepriseDTO entreprise;

    private List<RoleDTO> roles;

    public UtilisateurDTO fromEntity (Utilisateur utilisateur) {
        if (utilisateur == null) {
            return null;
        }
        return UtilisateurDTO.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .dateNaissance(utilisateur.getDateNaissance())
                .motPasse(utilisateur.getMotPasse())
                .photo(utilisateur.getPhoto())
                .build();
    }

    public Utilisateur toEntity (UtilisateurDTO utilisateurDTO) {
        if (utilisateurDTO == null){
            return null;
        }
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDTO.getId());
        utilisateur.setNom(utilisateurDTO.getNom());
        utilisateur.setDateNaissance(utilisateurDTO.getDateNaissance());
        utilisateur.setMotPasse(utilisateurDTO.getMotPasse());
        utilisateur.setPhoto(utilisateurDTO.getPhoto());

        return utilisateur;
    }
}
