package com.fr.momozer.Gestion2Stock.repository;
import com.fr.momozer.Gestion2Stock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CommandeClientRepository extends JpaRepository<CommandeClient, Integer> {
}
