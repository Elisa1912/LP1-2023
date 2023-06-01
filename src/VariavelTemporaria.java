public class VariavelTemporaria extends Gastos{

    private int tempoMeses;

    public VariavelTemporaria(String nome, double valor, int tempoMeses){
        super(nome, valor);
        this.tempoMeses = tempoMeses;
    }

    public int getTempoMeses() {
        return tempoMeses;
    }

    public void setTempoMeses(int tempoMeses) {
        this.tempoMeses = tempoMeses;
    }
    //sobrescrevendo o método da classe Gastos

    @Override
    public double MudarValor(double valor){
        System.out.println("override");
        return valor;
    }
}
