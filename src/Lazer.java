public class Lazer extends Gastos{

    private boolean importante;
    public Lazer(String nome, double valor, boolean importante){
        super(nome, valor);
        this.importante = importante;
    }
    //sobrescrevendo o método da classe Gastos

    @Override
    public double MudarValor(double valo){
        //setValor(getValor() + (getValor() * 0.05));
        setValor(getValor() + 3);
        return getValor();
    }

}
