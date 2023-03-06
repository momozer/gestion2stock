package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.CommandeFournisseur;
import com.fr.momozer.Gestion2Stock.model.Fournisseur;
import com.fr.momozer.Gestion2Stock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;
@Builder
@Data
public class CommandeFournisseurDTO {
    private Integer id;
    private String code;

    private Instant dateCommande;

    private FournisseurDTO fournisseur;

    private List<LigneCommandeFournisseurDTO> ligneCommandeFournisseurs;

    public CommandeFournisseurDTO fromEntity (CommandeFournisseur commandeFournisseur) {
        if (commandeFournisseur == null) {
            return null;
        }
        return CommandeFournisseurDTO.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .build();
    }

    public CommandeFournisseur toEntity (CommandeFournisseurDTO commandeFournisseurDTO) {
        if (commandeFournisseurDTO == null) {
            return null;
        }
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(commandeFournisseurDTO.getId());
        commandeFournisseur.setCode(commandeFournisseurDTO.getCode());
        commandeFournisseur.setDateCommande(commandeFournisseurDTO.getDateCommande());

        return commandeFournisseur;
    }
}
