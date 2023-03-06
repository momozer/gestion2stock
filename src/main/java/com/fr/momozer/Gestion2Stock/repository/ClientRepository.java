package com.fr.momozer.Gestion2Stock.repository;
import com.fr.momozer.Gestion2Stock.dto.ClientDTO;
import com.fr.momozer.Gestion2Stock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ClientRepository extends JpaRepository<Client, Integer> {

    ClientDTO findCLientByNomClient(String nomCLient);

    ClientDTO findCLientByPrenomClient( String prenom);

    ClientDTO findCLientByNumTelClient( String numTel);

    ClientDTO findCLientByMailClient( String mail);
}
