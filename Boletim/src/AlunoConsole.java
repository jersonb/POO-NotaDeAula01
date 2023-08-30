import java.util.ArrayList;
import java.util.List;

public class AlunoConsole {
    public static final int QUANTIDADE_NOTAS = 3;
    private String nome;
    private ArrayList<Float> notas;

    public AlunoConsole(String nome) {
        this.notas = new ArrayList();
        this.nome = nome;
    }

    public void addNota(String nota) {
        notas.add(Float.parseFloat(nota));
    }


    public Aluno getAluno() {
        return new Aluno(nome, notas);
    }

}
