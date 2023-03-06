package com.fr.momozer.Gestion2Stock.dto;

import com.fr.momozer.Gestion2Stock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
@Data
@Builder
public class CommandeClientDTO {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private FournisseurDTO fournisseur;
    private List<LigneCommandeFournisseurDTO> ligneCommandeFournisseurs;

    public CommandeClientDTO fromEntity(CommandeClient commandeClient) {
        if(commandeClient == null) {
            return null;
        }
        return CommandeClientDTO.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .build();
    }

    public CommandeClient toEntity(CommandeClientDTO commandeClientDTO) {
        if(commandeClientDTO == null) {
            return null;
        }
        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandeClientDTO.getId());
        commandeClient.setCode(commandeClientDTO.getCode());
        commandeClient.setDateCommande(commandeClientDTO.getDateCommande());

        return commandeClient;
    }
}
