package model;

import repository.Orcamento;

public class Pedido extends Orcamento {
    private String DatadeEntrega;
    private Boolean Entregue;

    public Pedido(String datadeEntrega) {
        super();
        DatadeEntrega = datadeEntrega;
    }

    public void setDatadeEntrega(String datadeEntrega) {
        DatadeEntrega = datadeEntrega;
    }
}
