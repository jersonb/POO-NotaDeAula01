import java.util.List;

public class Aluno {

    private final String nome;
    private final List<Float> notas;

    public Aluno(String nome, List<Float> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public float getNotaGeral() {
        var soma = notas
                .stream()
                .reduce(0f, (x, y) -> x + y);

        return soma / notas.size();
    }
}
