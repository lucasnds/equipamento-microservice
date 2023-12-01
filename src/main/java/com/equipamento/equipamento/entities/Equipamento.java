package com.equipamento.equipamento.entities;

import java.io.Serializable;
import java.util.Date;

import com.equipamento.equipamento.dtos.EquipamentoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "equipamento")
public class Equipamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column()
	private Long id;

	@Column()
	private String descricao;

	@Column()
	private String tipo;

	@Column()
	private Date adquiridoEm;

	@Column()
	private String tempoDeDepreciacao;

	@Column()
	private String finalidade;

	@Column()
	private boolean status;

	public Equipamento() {
	};

	public Equipamento(EquipamentoDTO data) {
		this.descricao = data.descricao();
		this.tipo = data.tipo();
		this.adquiridoEm = data.adquiridoEm();
		this.tempoDeDepreciacao = data.tempoDeDepreciacao();
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

	public Date getAdquiridoEm() {
		return adquiridoEm;
	}

	public void setAdquiridoEm(Date adquiridoEm) {
		this.adquiridoEm = adquiridoEm;
	}

	public String getTempoDeDepreciacao() {
		return tempoDeDepreciacao;
	}

	public void setTempoDeDepreciação(String tempoDeDepreciacao) {
		this.tempoDeDepreciacao = tempoDeDepreciacao;
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

	public void updateFromDTO(EquipamentoDTO equipamentoDTO) {
		if (equipamentoDTO.descricao() != null) {
						this.descricao = equipamentoDTO.descricao();
		}

		if (equipamentoDTO.tipo() != null) {
						this.tipo = equipamentoDTO.tipo();
		}

		if (equipamentoDTO.adquiridoEm() != null) {
						this.adquiridoEm = equipamentoDTO.adquiridoEm();
		}

		if (equipamentoDTO.tempoDeDepreciacao() != null) {
						this.tempoDeDepreciacao = equipamentoDTO.tempoDeDepreciacao();
		}

		if (equipamentoDTO.finalidade() != null) {
						this.finalidade = equipamentoDTO.finalidade();
		}

		this.status = equipamentoDTO.status();
}

}
