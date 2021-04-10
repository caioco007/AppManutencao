package br.edu.senai.appManutencao.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.senai.appManutencao.model.PlanoManutencao;

@Repository
public interface IPlanoManutencaoRepository extends CrudRepository<PlanoManutencao, Integer>{
	
	List<PlanoManutencao> findAll(Sort by);
}

