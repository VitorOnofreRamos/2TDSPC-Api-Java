package br.com.fiap.primeira_api.service;

import br.com.fiap.primeira_api.dto.PrateleiraRequestDto;
import br.com.fiap.primeira_api.dto.PrateleiraResponseDto;
import br.com.fiap.primeira_api.model.Livro;
import br.com.fiap.primeira_api.model.Prateleira;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Service;

@Service
public class PrateleiraMapper {
    // prateleiraRequestDTO (Record) para Prateleira
    public Prateleira requestRecordToPrateleira(PrateleiraRequestDto prateleiraRequestDTO) {
        Prateleira prateleira = new Prateleira();
        prateleira.setNome(prateleiraRequestDTO.nome());
        prateleira.setDescricao(prateleiraRequestDTO.descricao());
        return prateleira;
    }

    // prateleira para prateleiraResponseDTO (Record)
    public PrateleiraResponseDto prateleiraToResponseDTO(Prateleira prateleira, Link link) {
        return new PrateleiraResponseDto(
                prateleira.getId(),
                prateleira.getNome(),
                prateleira.getDescricao(),
                prateleira.getLivros(),
                link
        );
    }
}
