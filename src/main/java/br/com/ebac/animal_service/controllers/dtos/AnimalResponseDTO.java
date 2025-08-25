package br.com.ebac.animal_service.controllers.dtos;

import br.com.ebac.animal_service.entidades.enums.Especie;

import java.util.Date;

public record AnimalResponseDTO(Especie especie, String nome, Date dataRecebido) {
}
