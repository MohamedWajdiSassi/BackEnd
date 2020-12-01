package com.tekup.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.soap.entities.Voiture;

@Repository
public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
