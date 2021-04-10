package br.edu.senai.appManutencao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.senai.appManutencao.model.Empresa;
import br.edu.senai.appManutencao.service.EmpresaService;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {
	
	@Autowired 
	private EmpresaService empresaService;
	
	@GetMapping(value = "/obter")
	public List<Empresa> obterLista(){		
		return empresaService.obterLista();
	}

	@PostMapping(value = "/incluir")	
	public void incluir(@RequestBody Empresa empresa) {
		empresaService.incluir(empresa);
	}
			
	@GetMapping(value = "/{id}")
	public Empresa obterPorId(@PathVariable Integer id) {
		return empresaService.obterPorId(id);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		empresaService.excluir(id);
	}

}
