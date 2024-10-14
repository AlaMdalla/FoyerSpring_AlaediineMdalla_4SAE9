package com.example.demo.controllers;

import com.example.demo.entity.Bloc;
import com.example.demo.entity.Chambre;
import com.example.demo.serviceImplement.IblocServiceImp;
import com.example.demo.serviceImplement.IchambreServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")

public class ChambreController
{

    private final IchambreServiceImp ichambreServiceImp;
    @PostMapping("/add")
    Chambre addChambre(@RequestBody Chambre chambre){
        return this.ichambreServiceImp.addTo(chambre);
    }


    @GetMapping("/getAll")
    List<Chambre> getAll(){
        return  this.ichambreServiceImp.getAll();
    }
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable long id){
        this.ichambreServiceImp.delete(id);
    }
    @PutMapping("/update")
    Chambre update(@RequestBody  Chambre chambre){
        return this.ichambreServiceImp.update(chambre);
    }
}
