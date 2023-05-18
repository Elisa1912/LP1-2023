public abstract class Gastos {
    private String nome;
    private int valor;

    public Gastos(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void MudarValor(int valor){
       this.valor = valor;
    }
}
