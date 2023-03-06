package com.fr.momozer.Gestion2Stock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fr.momozer.Gestion2Stock.model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Data
@Builder
public class ClientDTO {
    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDTO adresse;

    private String photo;

    private String mail;

    private String numTel;

    @JsonIgnore
    private List<CommandeClientDTO> commandeClients;

    public ClientDTO fromEntity(Client client) {
        if (client == null) {
            return null;
        }
        return ClientDTO.builder().build();
    }

    public Client toEntity(ClientDTO clientDTO) {
        if(clientDTO == null) {
            return null;
        }

       Client client = new Client();
        client.setNom(clientDTO.getNom());
        client.setPrenom(clientDTO.getPrenom());
        client.setMail(clientDTO.getMail());
        return client;

    }
}
