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

import br.edu.senai.appManutencao.model.Equipamento;
import br.edu.senai.appManutencao.service.EquipamentoService;

@RestController
@RequestMapping("/api/empresa/equipamento")
public class EquipamentoController {
	
	@Autowired 
	private EquipamentoService equipamentoService;
	
	@GetMapping(value = "/obter")
	public List<Equipamento> obterLista(){		
		return equipamentoService.obterLista();
	}

	@PostMapping(		
			value = "/incluir",
			produces = {"application/json", "application/xml"}
			)	
	public void incluir(@RequestBody Equipamento equipamento) {
		equipamentoService.incluir(equipamento);
	}
			
	@GetMapping(value = "/{id}")
	public Equipamento obterPorId(@PathVariable Integer id) {
		return equipamentoService.obterPorId(id);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		equipamentoService.excluir(id);
	}

}
