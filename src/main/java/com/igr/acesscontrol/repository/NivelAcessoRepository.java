package com.igr.acesscontrol.repository;

import com.igr.acesscontrol.model.JornadaTrabalho;
import com.igr.acesscontrol.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {
}