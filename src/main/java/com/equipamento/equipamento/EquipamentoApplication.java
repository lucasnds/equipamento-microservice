package com.equipamento.equipamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.equipamento.equipamento")
public class EquipamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EquipamentoApplication.class, args);
	}

}
