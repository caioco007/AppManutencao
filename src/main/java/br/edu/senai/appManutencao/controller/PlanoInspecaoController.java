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

import br.edu.senai.appManutencao.model.PlanoInspecao;
import br.edu.senai.appManutencao.service.PlanoInspecaoService;

@RestController
@RequestMapping("/api/empresa/equipamento/inspecao")
public class PlanoInspecaoController {

	@Autowired 
	private PlanoInspecaoService inspecaoService;
	
	@GetMapping(value = "/obter")
	public List<PlanoInspecao> obterLista(){		
		return inspecaoService.obterLista();
	}

	@PostMapping(		
			value = "/incluir",
			produces = {"application/json", "application/xml"}
			)	
	public void incluir(
				@RequestBody PlanoInspecao inspecao
			) {
		inspecaoService.incluir(inspecao);
	}
			
	@PutMapping(value = "/{id}")
	public PlanoInspecao obterPorId(
			@PathVariable Integer id
			) {
		return inspecaoService.obterPorId(id);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(
				@PathVariable Integer id
			) {
		inspecaoService.excluir(id);
	}
}
