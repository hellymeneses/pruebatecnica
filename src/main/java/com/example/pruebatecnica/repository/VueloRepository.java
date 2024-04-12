package com.example.pruebatecnica.repository;

import com.example.pruebatecnica.entity.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo,Long> {
}
