
package com.equipamento.equipamento.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.equipamento.equipamento.dtos.EquipamentoDTO;
import com.equipamento.equipamento.entities.Equipamento;
import com.equipamento.equipamento.services.EquipamentoService;
import org.springframework.http.ResponseEntity;

@RestController()
@RequestMapping("/equipamentos")
public class EquipamentoController {

	@Autowired
	private EquipamentoService equipamentoService;

	@PostMapping
	public ResponseEntity<Equipamento> createEquipamento(@RequestBody EquipamentoDTO equipamento) {
		Equipamento newEquipamento = equipamentoService.createEquipamento(equipamento);
		return new ResponseEntity<>(newEquipamento, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Equipamento>> getAllEquipamentos() {
		List<Equipamento> equipamentos = this.equipamentoService.findAll();
		return new ResponseEntity<>(equipamentos, HttpStatus.OK);
	}
}
