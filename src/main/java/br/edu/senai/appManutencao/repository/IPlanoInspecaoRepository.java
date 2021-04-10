package br.edu.senai.appManutencao.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.senai.appManutencao.model.PlanoInspecao;

@Repository
public interface IPlanoInspecaoRepository extends CrudRepository<PlanoInspecao, Integer>{
	
	List<PlanoInspecao> findAll(Sort by);
}
