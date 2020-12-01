package com.tekup.soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.soap.entities.Trajet;

@Repository
public interface TrajetRepository extends JpaRepository<Trajet, Long>  {

}
