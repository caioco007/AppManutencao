package br.edu.senai.appManutencao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.senai.appManutencao.model.PlanoManutencao;
import br.edu.senai.appManutencao.repository.IPlanoManutencaoRepository;

@Service
public class PlanoManutencaoService {
	
	@Autowired
	private IPlanoManutencaoRepository planoManutencaoRepository;
	
	public  List<PlanoManutencao> obterLista() {
		return (List<PlanoManutencao>)planoManutencaoRepository.findAll(Sort.by(Sort.Direction.ASC, "modelo"));
	}
	
	public PlanoManutencao obterPorId(Integer id) {
		return planoManutencaoRepository.findById(id).orElse(null);
	}

	public void incluir(PlanoManutencao manutencao) {
		planoManutencaoRepository.save(manutencao);
	}
	
	public void excluir(Integer id) {
		planoManutencaoRepository.deleteById(id);
	}
}
