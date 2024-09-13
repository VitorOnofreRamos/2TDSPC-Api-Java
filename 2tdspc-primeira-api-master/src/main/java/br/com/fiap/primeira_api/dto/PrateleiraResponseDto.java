package br.com.fiap.primeira_api.dto;

import org.springframework.hateoas.Link;
import java.util.Collection;

public record PrateleiraResponseDto (
        String nome,
        String descricao,
        Collection<LivroResponseDto> livro,
        Link link
){}
