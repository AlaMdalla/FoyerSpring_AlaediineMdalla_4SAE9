package com.example.demo.serviceImplement;

import com.example.demo.entity.Bloc;
import com.example.demo.repositories.BlocRepository;
import com.example.demo.services.IblocService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.List;
@AllArgsConstructor
@Service
public class IblocServiceImp implements IblocService {
    BlocRepository blocRepository;
    @Override
    public Bloc addTo(Bloc object) {
        return  this.blocRepository.save(object);
    }

    @Override
    public void delete(Long aLong) {
this.blocRepository.deleteById(aLong);
    }

    @Override
    public List<Bloc> getAll() {
        return this.blocRepository.findAll();
    }

    @Override
    public Bloc update(Bloc object) {
        return  this.blocRepository.save(object);
    }
}
