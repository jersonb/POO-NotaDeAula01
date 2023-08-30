
public class AnaliseBoletim {
    private static final float CORTE = 4;
    private static final float MEDIA = 7;
    private final Aluno aluno;

    public AnaliseBoletim(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getSituacao() {
        var nota = aluno.getNotaGeral();

        if (nota < CORTE) {
            return "Reprovado";
        }
        if (nota < MEDIA) {
            return "Final";
        }
        return "Aprovado";
    }
    public  String analisar(){
        return  String.format("Aluno: %s\nNota Final: %.1f\nSituação: %s", aluno.getNome(), aluno.getNotaGeral(), getSituacao());
    }

    @Override
    public String toString() {
        return analisar();
    }
}
