import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

public class FolhaDePagamentoTests {
    @Test
    public void deve_criar_follha_com_funcionarios() {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new FuncionarioMock().novoFuncionario());
        funcionarios.add(new FuncionarioMock().novoFuncionario());
        funcionarios.add(new FuncionarioMock().novoFuncionario());
        funcionarios.add(new FuncionarioMock().novoFuncionario());
        var folhaDePagamentos = new FolhaDePagamento(funcionarios);
        var expected = folhaDePagamentos.gerar();
        assertFalse(expected.isBlank());
    }

    @Test
    public void deve_conter_quantidade_de_linhas_adequada() {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new FuncionarioMock().novoFuncionario());
        funcionarios.add(new FuncionarioMock().novoFuncionario());
        funcionarios.add(new FuncionarioMock().novoFuncionario());
        funcionarios.add(new FuncionarioMock().novoFuncionario());
        var folhaDePagamentos = new FolhaDePagamento(funcionarios);
        var expected = folhaDePagamentos.gerar();
        assertEquals(funcionarios.size() + 1, expected.split("\n").length);
    }

    @Test
    public void deve_criar_follha_com_funcionario() {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new FuncionarioMock().novoFuncionario());
        var folhaDePagamentos = new FolhaDePagamento(funcionarios);
        var expected = folhaDePagamentos.gerar();
        assertTrue(expected.startsWith("Nome\tMatrícula\tSalário\tDedução"));
        assertTrue(expected.endsWith("10.0\t1.5"));
    }

    private class FuncionarioMock extends FuncionarioDto {
        public FuncionarioMock() {
            nome = UUID.randomUUID().toString();
            matricula = UUID.randomUUID().toString();
            salarioBruto = 10;
        }
    }
}
