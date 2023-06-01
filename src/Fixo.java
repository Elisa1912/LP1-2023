public class Fixo extends Gastos{

    public Fixo(String nome, double valor){
        super(nome,valor);

    }
    //sobreescrevendo o método da classe Gastos

    @Override
    public double MudarValor(double valor){
        //setValor(getValor() + (getValor() * 0.05));
        return valor;
    }
}
