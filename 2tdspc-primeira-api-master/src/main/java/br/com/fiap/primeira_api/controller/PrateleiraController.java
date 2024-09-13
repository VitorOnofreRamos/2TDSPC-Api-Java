package br.com.fiap.primeira_api.controller;

import br.com.fiap.primeira_api.repository.LivroRepository;
import br.com.fiap.primeira_api.repository.PrateleiraRepository;
import br.com.fiap.primeira_api.service.LivroMapper;
import br.com.fiap.primeira_api.service.PrateleiraMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// localhost:8080/prateleira
@RequestMapping(value = "/prateleira", produces = {"application/json"})
@Tag(name = "api-prateleira")
public class PrateleiraController {
    @Autowired
    private PrateleiraRepository prateleiraRepository;
    @Autowired
    private PrateleiraMapper prateleiraMapper;
}
