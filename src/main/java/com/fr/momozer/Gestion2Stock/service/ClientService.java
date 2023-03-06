package com.fr.momozer.Gestion2Stock.service;

import com.fr.momozer.Gestion2Stock.dto.ArticleDTO;
import com.fr.momozer.Gestion2Stock.dto.ClientDTO;

import java.util.List;

public interface ClientService {

    ClientDTO save(ArticleDTO dto);

    ClientDTO findById(Integer id);

    ClientDTO findByNomClient( String nomCLient);

    ClientDTO findByPrenomClient( String prenom);

    ClientDTO findByNumTelClient( String numTel);

    ClientDTO findByMailClient( String mail);

    List<ClientDTO> findAll();

    void delete(Integer id);
}
