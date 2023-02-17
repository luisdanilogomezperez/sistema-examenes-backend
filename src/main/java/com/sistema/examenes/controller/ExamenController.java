package com.sistema.examenes.controller;

import com.sistema.examenes.entity.Categoria;
import com.sistema.examenes.entity.Examen;
import com.sistema.examenes.service.CategoriaService;
import com.sistema.examenes.service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/examen")
@CrossOrigin("*")
public class ExamenController {

    @Autowired
    private ExamenService examenService;

    @PostMapping("/")
    public ResponseEntity<Examen> guardarExamen(@RequestBody Examen examen){
        Examen examenGuardado = examenService.agregarExamen(examen);
        return ResponseEntity.ok(examenGuardado);
    }

    @GetMapping("/{examenId}")
    public Examen listarExamenPorId(@PathVariable("examenId") Long examenId){
        return examenService.obtenerExamen(examenId);
    }

    @GetMapping("/")
    public ResponseEntity<?> listarExamenes(){
        return ResponseEntity.ok(examenService.obtenerExamenes());
    }

    @PutMapping("/")
    public ResponseEntity<Examen> actualizarExamen(@RequestBody Examen examen){
        Examen examenGuardado = examenService.actualizarExamen(examen);
        return ResponseEntity.ok(examenGuardado);
    }

    @DeleteMapping("/{examenId}")
    public void eliminarExamen(@PathVariable("examenId") Long examenId){
        examenService.eliminarExamen(examenId);
    }
}
