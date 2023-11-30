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
	
	public List<Equipamento> findAll(){
		return repository.findAll();		
	}
	
	public Equipamento findById(Long id) {
		Optional<Equipamento> obj = repository.findById(id);
		return obj.get();
	}
	
	public Equipamento createEquipamento( EquipamentoDTO data){
		Equipamento newEquipamento = new Equipamento(data);
        this.saveEquipamento(newEquipamento);
        return newEquipamento;
    }

    public void saveEquipamento(Equipamento data){
        this.repository.save(data);
    }
	
	
}
