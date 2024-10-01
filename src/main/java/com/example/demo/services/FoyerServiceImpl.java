package com.example.demo.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Foyer;
import com.example.demo.repositories.FoyerRepository;

import java.util.List;
@Data
@AllArgsConstructor
@Service
public class FoyerServiceImpl implements IFoyerService {
    private FoyerRepository foyerRepository;
    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer); // <=> insert into .....
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return  foyerRepository.save(foyer);
    }

    @Override
    public List<Foyer> retrieFoyerAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer retrieFoyerById(Long idF) {
        return foyerRepository.findById(idF).orElse(null) ;
    }

    @Override
    public void DeleteFoyer(Long idF) {
        foyerRepository.deleteById(idF);

    }
}
