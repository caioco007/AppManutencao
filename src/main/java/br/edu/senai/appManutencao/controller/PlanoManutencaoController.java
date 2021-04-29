package br.edu.senai.appManutencao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senai.appManutencao.model.PlanoManutencao;
import br.edu.senai.appManutencao.service.PlanoManutencaoService;

@RestController
@RequestMapping("/api/empresa/equipamento/inspecao/manutencao")
public class PlanoManutencaoController {
	
	@Autowired 
	private PlanoManutencaoService manutencaoService;
	
	@GetMapping(value = "/obter")
	public List<PlanoManutencao> obterLista(){		
		return manutencaoService.obterLista();
	}

	@PostMapping(		
			value = "/incluir",
			produces = {"application/json", "application/xml"}
			)	
	public void incluir(
				@RequestBody PlanoManutencao manutencao
			) {
		manutencaoService.incluir(manutencao);
	}
			
	@PutMapping(value = "/{id}")
	public PlanoManutencao obterPorId(
			@PathVariable Integer id
			) {
		return manutencaoService.obterPorId(id);
	}
	
	@GetMapping(value = "/{id}/excluir")
	public void excluir(
				@PathVariable Integer id
			) {
		manutencaoService.excluir(id);
	}

}
