package com.equipamento.equipamento.dtos;

import java.util.Date;

public record EquipamentoDTO(String descricao, String tipo, Date adquiridoEm, String tempoDeDepreciacao, String finalidade, boolean status) {

}

