package br.com.fiap.api_rest.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_ESTOQUE")
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private UUID Id;
    @Column(name = "QUANTIDADE")
    private int quantidade;

    public Estoque() {
    }

    public Estoque(UUID id, int quantidade) {
        Id = id;
        this.quantidade = quantidade;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
