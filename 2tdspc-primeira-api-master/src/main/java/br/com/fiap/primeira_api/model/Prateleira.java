package br.com.fiap.primeira_api.model;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "TB_PRATELEIRA")
public class Prateleira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "prateleira_nome")
    private String nome;
    @Column(name = "prateleira_descricao")
    private String descricao;
    @ManyToMany(mappedBy = "prateleira")
    @JoinTable(
            name = "PRATELEIRA_LIVRO",
            joinColumns = @JoinColumn(name = "prateleira_id"),
            inverseJoinColumns = @JoinColumn(name = "livro_id")
    )
    private Collection<Livro> livros;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Collection<Livro> getLivros() {
        return livros;
    }

    public void setLivros(Collection<Livro> livros) {
        this.livros = livros;
    }
}
