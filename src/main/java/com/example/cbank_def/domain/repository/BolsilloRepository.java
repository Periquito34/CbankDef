package com.example.cbank_def.domain.repository;

import com.example.cbank_def.domain.Bolsillo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BolsilloRepository extends JpaRepository<Bolsillo,Integer> {
}
