public class Main {
    public static void main(String [] args){
        System.out.println("Entre com um valor: ");
        Lazer obj1 = new Lazer ("Sarah", 100, true);
        obj1.MudarValor(100);
        System.out.println(obj1.getNome());
        System.out.println(obj1.getValor());
    }
}
