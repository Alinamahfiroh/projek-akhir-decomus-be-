package com.example.Resto.controller;

import com.example.Resto.entity.Resto;
import com.example.Resto.service.RestoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/restos")
public class RestoController {

    @Autowired
    private RestoService restoService;

    @PostMapping
    public Resto saveResto(@RequestBody Resto resto) {
        return restoService.saveResto(resto);
    }

    @GetMapping
    public List<Resto> getAllResto() {
        return restoService.getAllResto();
    }

    @GetMapping("/{id}")
    public Resto getRestoById(@PathVariable Long id) {
        return restoService.getRestoById(id);
    }

    @PutMapping("/{id}")
    public Resto updateResto(@PathVariable Long id, @RequestBody Resto resto) {
        return restoService.updateResto(id, resto);
    }

    @DeleteMapping("/{id}")
    public void deleteResto(@PathVariable Long id) {
        restoService.deleteResto(id);
    }
}
