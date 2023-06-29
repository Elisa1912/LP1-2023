package model;

public class ItemPedido {
    private  Long idBase;
    private static Long id;
    private String Peca;
    private String Modelo;
    private String Tamanho;
    private Double Valor;

    public ItemPedido(Long idBase, String peca, String modelo, String tamanho, Double valor) {
        this.id=idBase++;
        Peca = peca;
        Modelo = modelo;
        Tamanho = tamanho;
        Valor = valor;
    }

    public ItemPedido() {

    }

    public Long getIdBase() {
        return idBase;
    }

    public void setIdBase(Long idBase) {
        this.idBase = idBase;
    }

    public String getPeca() {
        return Peca;
    }

    public void setPeca(String peca) {
        Peca = peca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }

    public Double getValor() {
        return Valor;
    }

    public void setValor(Double valor) {
        Valor = valor;
    }
}
