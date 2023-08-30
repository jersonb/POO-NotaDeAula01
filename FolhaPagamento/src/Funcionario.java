public class Funcionario {

    private final String nome;
    private final String matricula;
    private final float salarioBruto;
    public float descontorInss = 0.0f;
    public float salarioLiquido = 0.0f;

    public Funcionario(FuncionarioDto funcionario) {
        this.nome = funcionario.nome;
        this.matricula = funcionario.matricula;
        this.salarioBruto = funcionario.salarioBruto;
    }

    public void calcularInss(float aliquota) {
        descontorInss = salarioBruto * aliquota;
        salarioLiquido = salarioBruto - descontorInss;
    }

    @Override
    public String toString() {
        return String.join("\t", nome, matricula, Float.toString(salarioBruto), Float.toString(this.descontorInss));
    }
}
