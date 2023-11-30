package com.equipamento.equipamento.entities;

import java.io.Serializable;

import com.equipamento.equipamento.dtos.EquipamentoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "equipamento")
public class Equipamento implements Serializable  {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private String tipo;
	private String adquiridoEm;
	private String tempoDeDepreciação;
	private String finalidade;
	private boolean status;
	
	//@JsonIgnore
	//@OneToMany(mappedBy = "client")
	//private List<Order> orders = new ArrayList<>();
	
	public Equipamento(EquipamentoDTO data) {
		this.descricao = data.descricao();
		this.tipo = data.tipo();
		this.adquiridoEm = data.adquiridoEm();
		this.tempoDeDepreciação = data.tempoDeDepreciação();
		this.finalidade = data.finalidade();
		this.status = data.status();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getAdquiridoEm() {
		return adquiridoEm;
	}



	public void setAdquiridoEm(String adquiridoEm) {
		this.adquiridoEm = adquiridoEm;
	}



	public String getTempoDeDepreciação() {
		return tempoDeDepreciação;
	}



	public void setTempoDeDepreciação(String tempoDeDepreciação) {
		this.tempoDeDepreciação = tempoDeDepreciação;
	}



	public String getFinalidade() {
		return finalidade;
	}



	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}



	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
