package br.com.ebac.animal_service.service;

import br.com.ebac.animal_service.controllers.dtos.AnimalResponseDTO;
import br.com.ebac.animal_service.controllers.dtos.FuncionarioResponseDTO;
import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.entidades.Funcionario;
import br.com.ebac.animal_service.entidades.enums.Especie;
import br.com.ebac.animal_service.repository.AnimalRepository;
import br.com.ebac.animal_service.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;
    @Autowired
    private AnimalRepository animalRepository;

    public List<FuncionarioResponseDTO> getAnimaisResgatados(Date dataInicio, Date dataFim) {
        verificarIntervaloData(dataInicio, dataFim);
        var funcionarios = repository.findAll();
        List<FuncionarioResponseDTO> dto = new ArrayList<>();

        for (Funcionario funcionario: funcionarios) {
            var animaisResgatados = funcionario.getAnimaisResgatados();
            var animaisResgatadosPorData = animaisResgatadosPorData(animaisResgatados, dataInicio, dataFim);
            List<AnimalResponseDTO> animalDtos = getNomeAndEspecie(animaisResgatadosPorData);

            dto.add(new FuncionarioResponseDTO(funcionario.getNome(), animaisResgatadosPorData.size(), animalDtos));
        }
        return dto;
    }

    private void verificarIntervaloData(Date dataInicio, Date dataFim) {
        LocalDate inicio = dataInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fim = dataFim.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Valida intervalo máximo de 1 ano
        long anos = ChronoUnit.YEARS.between(inicio, fim);
        if (anos > 1) {
            throw new IllegalArgumentException("O intervalo de datas não pode ser maior que 1 ano.");
        }

    }

    private List<AnimalResponseDTO> getNomeAndEspecie(List<Animal> animaisResgatados) {
        List<AnimalResponseDTO> dtos = new ArrayList<>();
        animaisResgatados.forEach(animal -> dtos.add(new AnimalResponseDTO(Especie.valueOf(animal.getRaca().getEspecie().name()), animal.getNomeProvisorio(), animal.getDataEntrada())));
        return dtos;
    }

    private List<Animal> animaisResgatadosPorData(List<Animal> animaisResgatados, Date dataInicio, Date dataFim) {
        return animaisResgatados.stream()
                .filter(animal ->
                        animal.getDataEntrada().before(dataFim) && animal.getDataEntrada().after(dataInicio)).toList();
    }
}
