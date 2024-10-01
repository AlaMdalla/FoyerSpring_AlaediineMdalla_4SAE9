package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
