package com.equipamento.equipamento.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.equipamento.equipamento.dtos.EquipamentoDTO;
import com.equipamento.equipamento.entities.Equipamento;
import com.equipamento.equipamento.repositories.EquipamentoRepositories;
import java.util.List;
import java.util.Optional;

@Service
public class EquipamentoService {

	@Autowired
	private EquipamentoRepositories repository;

	public List<Equipamento> findAll() {
		return repository.findAll();
	}

	public Equipamento findById(Long id) {
		Optional<Equipamento> obj = repository.findById(id);
		return obj.get();
	}

	public Equipamento createEquipamento(EquipamentoDTO data) {
		Equipamento newEquipamento = new Equipamento(data);
		this.saveEquipamento(newEquipamento);
		return newEquipamento;
	}

	public void saveEquipamento(Equipamento data) {
		this.repository.save(data);
	}

	public Equipamento delete(Long id) {
		Optional<Equipamento> obj = repository.findById(id);
		if (obj.isPresent()) {
			repository.deleteById(id);
			return obj.get();
		} else {
			return null;
		}
	}

	public Equipamento updateEquipamento(Long id, EquipamentoDTO newData) {
		Optional<Equipamento> optionalEquipamento = repository.findById(id);

		if (optionalEquipamento.isPresent()) {
			Equipamento existingEquipamento = optionalEquipamento.get();
			existingEquipamento.updateFromDTO(newData); // Suponha que você tenha um método updateFromDTO em Equipamento
			saveEquipamento(existingEquipamento);
			return existingEquipamento;
		} else {
			return null; // Retorna nulo se o equipamento não for encontrado
		}
	}

}
