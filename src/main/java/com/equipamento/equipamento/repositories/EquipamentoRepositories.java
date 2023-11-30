package com.equipamento.equipamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equipamento.equipamento.entities.Equipamento;

public interface EquipamentoRepositories extends JpaRepository<Equipamento, Long> {

}
