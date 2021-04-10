package br.edu.senai.appManutencao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.senai.appManutencao.model.PlanoInspecao;
import br.edu.senai.appManutencao.repository.IPlanoInspecaoRepository;

@Service
public class PlanoInspecaoService {
	
	@Autowired
	private IPlanoInspecaoRepository planoInspecaoRepository;
	
	public  List<PlanoInspecao> obterLista() {
		return (List<PlanoInspecao>)planoInspecaoRepository.findAll(Sort.by(Sort.Direction.ASC, "modelo"));
	}
	
	public PlanoInspecao obterPorId(Integer id) {
		return planoInspecaoRepository.findById(id).orElse(null);
	}

	public void incluir(PlanoInspecao inspecao) {
		planoInspecaoRepository.save(inspecao);
	}
	
	public void excluir(Integer id) {
		planoInspecaoRepository.deleteById(id);
	}
}
