package com.example.demo.serviceImplement;

import com.example.demo.entity.Foyer;
import com.example.demo.repositories.FoyerRepository;
import com.example.demo.services.IfoyerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class IFoyerServiceImp implements IfoyerService {
    FoyerRepository foyerRepository;
    @Override
    public Foyer addTo(Foyer object) {
        return foyerRepository.save(object);
    }

    @Override
    public void delete(Long aLong) {
this.foyerRepository.deleteById(aLong);
    }

    @Override
    public List<Foyer> getAll() {
        return this.foyerRepository.findAll();
    }

    @Override
    public Foyer update(Foyer object) {
        return foyerRepository.save(object);
    }
}
