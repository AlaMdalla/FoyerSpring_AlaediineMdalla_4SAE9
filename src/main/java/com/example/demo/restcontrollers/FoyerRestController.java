package com.example.demo.restcontrollers;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Foyer;
import com.example.demo.services.IFoyerService;

import java.util.List;

@AllArgsConstructor
@RestController
public class FoyerRestController {
    private IFoyerService   IfoyerService;

    @PostMapping("/addFoyer")
    public Foyer AddFoyer( @RequestBody Foyer foyer) {
        return  IfoyerService.addFoyer(foyer);
    }
    @PutMapping("/UpdateFoyer")
    public Foyer UpdateFoyer( @RequestBody Foyer foyer) {
        return IfoyerService.updateFoyer(foyer);
    }

    @GetMapping("/retiAllFoyer")
    public List<Foyer> retriAllFoyers() {
        return  IfoyerService.retrieFoyerAllFoyer();
    }
    @GetMapping("/retiFoyerById/{idF}")
    public Foyer retriFoyerById(@PathVariable Long idF) {
        return IfoyerService.retrieFoyerById(idF);
    }
    @DeleteMapping("/deleteFoyer/{idF}")
    public void  DeleteFoyer( @PathVariable Long idF) {
        IfoyerService.DeleteFoyer(idF); }

}
