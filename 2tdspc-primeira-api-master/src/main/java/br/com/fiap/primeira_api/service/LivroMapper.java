package br.com.fiap.primeira_api.service;

import br.com.fiap.primeira_api.dto.LivroRequestDto;
import br.com.fiap.primeira_api.dto.LivroResponseDto;
import br.com.fiap.primeira_api.model.Livro;
import org.springframework.hateoas.Link;
import org.springframework.stereotype.Service;

@Service
public class LivroMapper {
    // livroRequestDTO (Record) para Livro
    public Livro requestRecordToLivro(LivroRequestDto livroRequestDto) {
        Livro livro = new Livro();
        livro.setTitulo(livroRequestDto.titulo());
        livro.setAutor(livroRequestDto.autor());
        livro.setCategoria(livroRequestDto.categoria());
        livro.setEditora(livroRequestDto.editora());
        livro.setIsbn(livroRequestDto.isbn());
        return livro;
    }

    // livro para livroResponseDTO (Record)
    public LivroResponseDto livroToResponseDto(Livro livro, Link link) {
        return new LivroResponseDto(
                livro.getId(),
                livro.getTitulo(),
                livro.getAutor(),
                livro.getCategoria().toString(),
                livro.getEditora(),
                livro.getIsbn(),
                link
        );
    }
}