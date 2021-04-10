package br.edu.senai.appManutencao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.senai.appManutencao.model.Equipamento;
import br.edu.senai.appManutencao.repository.IEquipamentoRepository;

@Service
public class EquipamentoService{
	
	@Autowired
	private IEquipamentoRepository equipamentoRepository;
	
	public  List<Equipamento> obterLista() {
		return (List<Equipamento>)equipamentoRepository.findAll(Sort.by(Sort.Direction.ASC, "modelo"));
	}
	
	public Equipamento obterPorId(Integer id) {
		return equipamentoRepository.findById(id).orElse(null);
	}

	public void incluir(Equipamento equipamento) {
		equipamentoRepository.save(equipamento);
	}
	
	public void excluir(Integer id) {
		equipamentoRepository.deleteById(id);
	}
}
