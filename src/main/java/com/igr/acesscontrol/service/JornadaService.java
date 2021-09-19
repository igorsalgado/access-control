package com.igr.acesscontrol.service;

import com.igr.acesscontrol.model.JornadaTrabalho;
import com.igr.acesscontrol.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    //Salvar
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }
    //Buscar todos os elementos da tabela
    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    //Buscar todos os elementos da tabela por ID
    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    //Update na tabela
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    //Deletar ID na tabela
    public void deleteJornada(Long idJornada){
        jornadaRepository.deleteById(idJornada);
    }
}
