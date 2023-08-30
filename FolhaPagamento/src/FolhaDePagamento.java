import java.util.ArrayList;
import java.util.StringJoiner;

public class FolhaDePagamento {
    private static float INSS = 0.15f;
    private StringJoiner folhaDePagamentos;
    public  FolhaDePagamento(ArrayList<Funcionario> funcionarios){
        folhaDePagamentos = new StringJoiner("\n");
        folhaDePagamentos.add( "Nome\tMatrícula\tSalário\tDedução");
        funcionarios.forEach(funcionario -> {
            funcionario.calcularInss(INSS);
            this.folhaDePagamentos.add(funcionario.toString());
        });
    }

    public String gerar(){
        return  folhaDePagamentos.toString();
    }

    @Override
    public String toString() {
        return gerar();
    }
}
