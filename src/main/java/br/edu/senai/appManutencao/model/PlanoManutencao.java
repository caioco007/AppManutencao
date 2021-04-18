package br.edu.senai.appManutencao.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TManutencao")
public class PlanoManutencao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String epis;
	private String atividades;
	private String localizacao;
	private String frequencia;
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinTable(name = "TInspecaoManutencao",	
		joinColumns = {@JoinColumn(name="idInspecao")},
		inverseJoinColumns = {@JoinColumn(name="idManutencao")})
	private PlanoInspecao inspecao;
	
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
	public String getAtividades() {
		return atividades;
	}
	public void setAtividades(String atividades) {
		this.atividades = atividades;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	public PlanoInspecao getInspecao() {
		return inspecao;
	}
	public void setInspecao(PlanoInspecao inspecao) {
		this.inspecao = inspecao;
	}
		
}
