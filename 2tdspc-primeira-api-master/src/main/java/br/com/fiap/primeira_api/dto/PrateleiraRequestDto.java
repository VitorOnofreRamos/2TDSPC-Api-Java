package br.com.fiap.primeira_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record PrateleiraRequestDto (
    @NotBlank(message = "O nome da pratileira é obrigatório")
    String nome,
    @Size(max = 200, message = "A descrição da prateleira não pode exceder 200 caracteres")
    String descricao
){}
