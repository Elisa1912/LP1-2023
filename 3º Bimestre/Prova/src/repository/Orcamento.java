package repository;

import model.ItemPedido;

import java.util.List;
public class Orcamento {

    private static Long idBase;
    private Long id;
    private Double ValorTotal;
    private List<ItemPedido> itens;

    public Orcamento(){

        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        ValorTotal = valorTotal;
    }
}
