package br.edu.senai.appManutencao.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.senai.appManutencao.model.Empresa;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa, Integer>{
	
	List<Empresa> findAll(Sort by);
}

