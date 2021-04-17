package br.edu.senai.appManutencao.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TInspecao")
public class PlanoInspecao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String epis;
	private String elementos;
	private String tipo;
	private String frequencia;
	@OneToMany(cascade = CascadeType.DETACH)
	@JoinTable(name = "TInspecaoManutencao",	
		joinColumns = {@JoinColumn(name="idInspecao")},
		inverseJoinColumns = {@JoinColumn(name="idManutencao")})
	private List<PlanoManutencao> manutencao;
	
	
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	public String getEpis() {
		return epis;
	}
	public void setEpis(String epis) {
		this.epis = epis;
	}
	public String getElementos() {
		return elementos;
	}
	public void setElementos(String elementos) {
		this.elementos = elementos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}	
	public List<PlanoManutencao> getManutencao() {
		return manutencao;
	}	
}
