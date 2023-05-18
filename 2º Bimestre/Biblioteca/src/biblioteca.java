import java.util.ArrayList;
import java.util.List;

public class biblioteca {
    private String nome;
    private Dono dono;
    protected List<livros> livros = new ArrayList<>();
    protected List<funcionarios> funcionarios = new ArrayList<>();

    public biblioteca(String nome, Dono Dono){
        this.nome= nome;
        this.dono = Dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public List<livros> getLivros() {
        return livros;
    }

    public void setLivros(List<livros> livros) {
        this.livros = livros;
    }

    public List<funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addlivros(livros livros){
        this.livros.add(livros);
    }

    public void addFuncionarios(funcionarios funcionarios) {
        this.funcionarios.add(funcionarios);
    }
    public void mostrarlivros (){
        for (livros livro : this.livros) {
            System.out.println("Nome do livro:" + livro.getNome());
        }
    }

}
