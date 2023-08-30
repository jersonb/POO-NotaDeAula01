import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FuncionarioTests {

    @Test
    public void deve_realizar_calculo_de_inss_de_acordo_com_aliquota() {

        var funcionario = new FuncionarioMock().novoFuncionario();
        funcionario.calcularInss(0.1f);
        assertEquals(10, funcionario.descontorInss);
    }

    @Test
    public void deve_realizar_calculo_de_salario_liquido() {

        var funcionario = new FuncionarioMock().novoFuncionario();
        funcionario.calcularInss(0.1f);
        assertEquals(90, funcionario.salarioLiquido);
    }

    @Test
    public void deve_descrever_funcionario() {

        var funcionario = new FuncionarioMock().novoFuncionario();
        funcionario.calcularInss(0.1f);
        assertEquals("\t\t100.0\t10.0", funcionario.toString());
    }

    private class FuncionarioMock extends FuncionarioDto {
        public FuncionarioMock() {
            this.matricula = "";
            this.nome = "";
            this.salarioBruto = 100f;
        }
    }
}
