package com.example.demo.repositories;

import com.example.demo.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository  extends JpaRepository<Etudiant,Long> {
}
