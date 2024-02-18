package com.example.Resto.repository;

import com.example.Resto.entity.Resto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestoRepository extends JpaRepository<Resto, Long> {
}
