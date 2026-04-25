package br.com.fiap.api_rest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.AssertFalse;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "TB_PEDIDO")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private UUID Id;
    @Column(name= "STATUS")
    private StatusPedido status;
    @Column(name= "DATA")
    private LocalDateTime data;
    @Column(name= "VALOR")
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;
    @ManyToMany
    @JoinTable(name = "PRODUTO_PEDIDO",
            joinColumns = @JoinColumn(name = "ID_PRODUTO", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "ID_PEDIDO", referencedColumnName = "id"))
    private List<Produto> produtos;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
