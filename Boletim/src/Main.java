import java.util.Scanner;

public class Main {
    /*
     * Elabore um programa em java que informe se um aluno ele está
     * aprovado, reprovado ou na final.
     * O sistema deve solicitar o nome e as notas do aluno.
     * Em seguida, realiza o cálculo da média e informa a situação acadêmica.
     * Se a média for ›= 70 está aprovado, abaixo de 40 está reprovado, senão, está na final.
     * */
    public static void main(String[] args) {

        System.out.println("Informe os dados do aluno:");
        var sc = new Scanner(System.in);
        System.out.println("nome: ");
        var nome = sc.nextLine();

        var alunoConsole = new AlunoConsole(nome);
        for (var i = 1; i <= AlunoConsole.QUANTIDADE_NOTAS; i++) {
            System.out.println("informe a " + i + "º nota: ");
            alunoConsole.addNota(sc.nextLine());
        }
        var analiseBoletim = new AnaliseBoletim(alunoConsole.getAluno());
        System.out.println(analiseBoletim);

    }
}