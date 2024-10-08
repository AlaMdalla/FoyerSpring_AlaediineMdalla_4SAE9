package com.example.demo.repositories;

import com.example.demo.entity.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
