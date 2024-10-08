package com.example.demo.serviceImplement;

import com.example.demo.entity.Chambre;
import com.example.demo.repositories.ChambreRepository;
import com.example.demo.services.IchambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class IchambreServiceImp implements IchambreService {
    ChambreRepository chambreRepository;
    @Override
    public Chambre addTo(Chambre object) {
        return this.chambreRepository.save(object);
    }

    @Override
    public void deleteChambre(Long aLong) {
        this.chambreRepository.deleteById(aLong);
    }

    @Override
    public List<Chambre> getAll() {
        return  this.chambreRepository.findAll();
    }

    @Override
    public Chambre update(Chambre object) {
        return this.chambreRepository.save(object);
    }
}
