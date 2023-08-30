import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
     * Elabore um programa de uma indústria realiza a folha mensal de pagamentos de ser
     * empregados baseando-se nas seguintes regras:
     * a. Inicialmente, ler os dados de cada funcionário (matrícula, nome e salário bruto);
     * b. Depois, o programa deve processar o desconto do INSS, que é 15% do salário bruto e o salário líquido é a diferença entre o salário bruto e a dedução do INSS.
     * c. Por fim, exibir na tela o seu contracheque, cujo formato é dado a seguir
     * Matrícula:
     * Nome completo:
     * Salário Bruto:
     * Dedução INSS:
     * */
    public static void main(String[] args) {
        var continuar = true;
        var sc = new Scanner(System.in);
        var funcionarios = new ArrayList<Funcionario>();

        do {
            System.out.println("Informe funcionário");

            System.out.println("Informe a matrícula do funcionário");
            var matricula = sc.nextLine();

            System.out.println("Informe o nome do funcionário");
            var nome = sc.nextLine();

            System.out.println("Informe o salário bruto do funcionário");
            var salarioBruto = sc.nextLine();

            var funcionario = new FuncionarioInseridoPorConsole(matricula, nome, salarioBruto).novoFuncionario();

            funcionarios.add(funcionario);
            System.out.println("Deseja adicionar mais um? [S]/n");

            continuar = !sc.nextLine().toLowerCase().equals("n");

        } while (continuar);

        var folhaDePagamento = new FolhaDePagamento(funcionarios);

        System.out.println(folhaDePagamento);
    }
}