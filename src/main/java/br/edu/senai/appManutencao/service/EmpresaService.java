package br.edu.senai.appManutencao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.senai.appManutencao.model.Empresa;
import br.edu.senai.appManutencao.repository.IEmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private IEmpresaRepository empresaRepository;
	
	public  List<Empresa> obterLista() {
		return (List<Empresa>)empresaRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
	}
	
	public Empresa obterPorId(Integer id) {
		return empresaRepository.findById(id).orElse(null);
	}

	public void incluir(Empresa empresa) {
		empresaRepository.save(empresa);
	}
	
	public void excluir(Integer id) {
		empresaRepository.deleteById(id);
	}
}
