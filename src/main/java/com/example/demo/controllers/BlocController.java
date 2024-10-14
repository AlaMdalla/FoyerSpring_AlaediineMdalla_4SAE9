package com.example.demo.controllers;

import com.example.demo.entity.Bloc;
import com.example.demo.serviceImplement.IblocServiceImp;
import com.example.demo.services.IblocService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/block")
public class BlocController {
private final IblocServiceImp iblocService;
 @PostMapping("/add")
   Bloc addBlock(@RequestBody  Bloc bloc){
     System.out.println(bloc.getNomBloc());
    return this.iblocService.addTo(bloc);
 }


 @GetMapping("/getAll")
    List<Bloc> getAll(){
     return  this.iblocService.getAll();
 }
 @DeleteMapping("/delete/{id}")
    void delete(@PathVariable long id){
     this.iblocService.delete(id);
 }
    @PutMapping("/update")
    Bloc update(@RequestBody  Bloc bloc){
        return this.iblocService.update(bloc);
    }
}
