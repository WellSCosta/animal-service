package br.com.ebac.animal_service.controllers;

import br.com.ebac.animal_service.controllers.dtos.FuncionarioResponseDTO;
import br.com.ebac.animal_service.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping("/animais-resgatados")
    private List<FuncionarioResponseDTO> findAnimaisResgatados(@RequestParam("inicio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date inicio,
                                                               @RequestParam("fim") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fim) {
        return service.getAnimaisResgatados(inicio, fim);
    }
}
