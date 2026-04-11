package br.com.fiap.api_rest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertFalse;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "TB_PEDIDO")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private UUID Id;
    @Column(name= "STATUS")
    private String status;
    @Column(name= "DATA")
    private LocalDate data;
    @Column(name= "ID_PRODUTO")
    private Produto produto;
    @Column(name= "VALOR")
    private double valor;

    public Pedido() {
    }

    public Pedido(UUID id, String status, LocalDate data, Produto produto, double valor) {
        Id = id;
        this.status = status;
        this.data = data;
        this.produto = produto;
        this.valor = valor;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
