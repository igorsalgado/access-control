package com.igr.acesscontrol.controller;

import com.igr.acesscontrol.model.JornadaTrabalho;
import com.igr.acesscontrol.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByIdList(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(
                jornadaService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Jornada não encontrada"))
        );


    }
}
