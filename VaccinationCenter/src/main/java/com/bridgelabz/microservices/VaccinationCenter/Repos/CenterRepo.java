package com.bridgelabz.microservices.VaccinationCenter.Repos;

import com.bridgelabz.microservices.VaccinationCenter.Entity.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepo extends JpaRepository<VaccinationCenter, Integer>{

}
