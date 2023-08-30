import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class AnaliseBoletimTests {
    @Test
    public void deve_estar_reporvado() {
        var aluno = new Aluno("", Arrays.asList(3f));
        var analiseBoletim = new AnaliseBoletim(aluno);

        var resultado = analiseBoletim.getSituacao();
        Assertions.assertEquals("Reprovado", resultado);
    }
    @Test
    public void deve_estar_na_final_limite_inferior() {
        var aluno = new Aluno("",  Arrays.asList(4f));
        var analiseBoletim = new AnaliseBoletim(aluno);

        var resultado = analiseBoletim.getSituacao();
        Assertions.assertEquals("Final", resultado);
    }
    @Test
    public void deve_estar_na_final_limite_superior() {
        var aluno = new Aluno("",  Arrays.asList(6f));
        var analiseBoletim = new AnaliseBoletim(aluno);

        var resultado = analiseBoletim.getSituacao();
        Assertions.assertEquals("Final", resultado);
    }
    @Test
    public void deve_estar_aprovado() {
        var aluno = new Aluno("",  Arrays.asList(7f));
        var analiseBoletim = new AnaliseBoletim(aluno);

        var resultado = analiseBoletim.getSituacao();
        Assertions.assertEquals("Aprovado", resultado);
    }

    @Test
    public void deve_gerar_reatorio() {

        var aluno = new Aluno("a",  Arrays.asList(7f));
        var analiseBoletim = new AnaliseBoletim(aluno);
        var expected = "Aluno: a\nNota Final: 7,0\nSituação: Aprovado";

        Assertions.assertEquals(expected, analiseBoletim.toString());
    }

}
