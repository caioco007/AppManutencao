package br.edu.senai.appManutencao.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.senai.appManutencao.model.Empresa;

@Repository
public interface IEmpresaRepository extends CrudRepository<Empresa, Integer>{
	
	List<Empresa> findAll(Sort by);
}

