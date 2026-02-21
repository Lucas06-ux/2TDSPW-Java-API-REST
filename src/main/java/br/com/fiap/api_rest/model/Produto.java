package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name ="TB_PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private UUID id;
    @Column(name = "NOME_PRODUTO")
    private String nome;
    @Column(name = "PRECO_PRODUTO")
    private BigDecimal preco;
    @Column(name = "DATA_VALIDADE")
    private LocalDate expiracao;

    public Produto() {
    }

    public Produto(String nome, BigDecimal preco, LocalDate expiracao) {
        this.nome = nome;
        this.preco = preco;
        this.expiracao = expiracao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(LocalDate expiracao) {
        this.expiracao = expiracao;
    }
}
