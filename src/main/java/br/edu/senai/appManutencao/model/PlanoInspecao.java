package br.edu.senai.appManutencao.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "TInspecao")
public class PlanoInspecao implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String epis;
	private String elementos;
	private String tipo;
	private String frequencia;
	@OneToMany(mappedBy = "inspecao", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonBackReference
	private List<PlanoManutencao> manutencao;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idEquipamento")
	private Equipamento equipamento;	
	
		
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
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	
	
}
