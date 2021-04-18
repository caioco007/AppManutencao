package br.edu.senai.appManutencao.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "TEquipamentos")
public class Equipamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@OneToOne(mappedBy = "equipamento", fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JsonBackReference	
	private PlanoInspecao inspecao;
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinTable(name = "TEmpresaEquipamento",	
	joinColumns = {@JoinColumn(name="idEquipamento")},
	inverseJoinColumns = {@JoinColumn(name="idEmpresa")})
	private Empresa empresa;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public PlanoInspecao getInspecao() {
		return inspecao;
	}
	public void setInspecao(PlanoInspecao inspecao) {
		this.inspecao = inspecao;
	}	
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
		
}
