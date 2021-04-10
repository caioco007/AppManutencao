package br.edu.senai.appManutencao.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.senai.appManutencao.model.Equipamento;

@Repository
public interface IEquipamentoRepository extends CrudRepository<Equipamento, Integer>{
	
	List<Equipamento> findAll(Sort by);
}
