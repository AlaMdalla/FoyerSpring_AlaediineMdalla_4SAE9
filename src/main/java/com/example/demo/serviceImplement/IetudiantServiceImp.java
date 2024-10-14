package com.example.demo.serviceImplement;

import com.example.demo.entity.Etudiant;
import com.example.demo.repositories.EtudiantRepository;
import com.example.demo.services.IetudientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IetudiantServiceImp implements IetudientService {
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addTo(Etudiant object) {
        return this.etudiantRepository.save(object);
    }

    @Override
    public void delete(Long aLong) {
        this.etudiantRepository.deleteById(aLong);

    }

    @Override
    public List<Etudiant> getAll() {
        return this.etudiantRepository.findAll();
    }

    @Override
    public Etudiant update(Etudiant object) {
        return this.etudiantRepository.save(object);
    }
}
