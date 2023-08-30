public abstract class FuncionarioDto {
    protected String matricula;
    protected String nome;
    protected float salarioBruto;

    public Funcionario novoFuncionario() {
        return new Funcionario(this);
    }
}
