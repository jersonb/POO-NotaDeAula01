import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuncionarioInseridoPorConsoleTests {
    @Test
    public void deve_construir_objeto_adequado() {
        Assertions.assertEquals(1f, new FuncionarioInseridoPorConsole("", "", "1").salarioBruto);
        Assertions.assertEquals(1.1f, new FuncionarioInseridoPorConsole("", "", "1,1").salarioBruto);
        Assertions.assertEquals(1.1f, new FuncionarioInseridoPorConsole("", "", "1.1").salarioBruto);
        Assertions.assertEquals(0f, new FuncionarioInseridoPorConsole("", "", "0").salarioBruto);
        Assertions.assertEquals(0f, new FuncionarioInseridoPorConsole("", "", "").salarioBruto);
    }
}
