package br.com.ebac.animal_service.controllers.dtos;

import java.util.List;

public record FuncionarioResponseDTO(String funcionarioNome, Integer qtdAnimais, List<AnimalResponseDTO> animaisResgatados) {
}
