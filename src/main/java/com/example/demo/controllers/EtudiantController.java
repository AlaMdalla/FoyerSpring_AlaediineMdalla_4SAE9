package com.example.demo.controllers;

import com.example.demo.entity.Etudiant;
import com.example.demo.services.IetudientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    private final IetudientService ietudientService;
    @PostMapping("/add")
    Etudiant add(@RequestBody Etudiant etudiant){
        return this.ietudientService.addTo(etudiant);
    }


    @GetMapping("/getAll")
    List<Etudiant> getAll(){
        return  this.ietudientService.getAll();
    }
    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable long id){
        this.ietudientService.delete(id);
    }
    @PutMapping("/update")
    Etudiant update(@RequestBody  Etudiant etudiant){
        return this.ietudientService.update(etudiant);
    }
}
