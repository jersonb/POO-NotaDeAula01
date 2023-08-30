public class FuncionarioInseridoPorConsole extends FuncionarioDto{
    FuncionarioInseridoPorConsole(String nome, String matricula, String salarioBruto){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBruto = (salarioBruto.isEmpty() || salarioBruto.isBlank()) ? 0f : Float.parseFloat(salarioBruto.replace(',','.'));
    }
}
