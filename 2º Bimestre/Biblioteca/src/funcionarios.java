public class funcionarios {
    private String nome;
    protected int CPF;

    public funcionarios (String nome, int CPF){
        System.out.println("Novo funcionário");
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

}
