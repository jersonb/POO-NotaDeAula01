import java.util.Scanner;

public class Main {
    /*
     *Questao 3
     * Defina um sistema que simule uma calculadora com soma, subtração, multiplicação e divisão.
     * Caso o usuário informe 1 ele vai ver a soma de dois números digitados por ele. Caso informe 2, vai ver a subtração, 3 divisão e 4 multiplicação.
     * Faça o usuário poder ver quantas vezes ele desejar estas operações, para isso, basta digitar o número 0.
     * */
    public static void main(String[] args) {

        var continuar = true;
        do {
            System.out.println("Informe dois números e em seguida a operação desejada");

            var sc = new Scanner(System.in);
            System.out.println("Informe 2 numeros: ");

            System.out.print("Primeiro numero: ");
            var num1 = Float.parseFloat(sc.next());

            System.out.print("Segundo numero: ");
            var num2 = Float.parseFloat(sc.next());

            System.out.println("Informe a operação matemática");
            System.out.println("1 - somar");
            System.out.println("2 - subtrair");
            System.out.println("3 - divisão");
            System.out.println("4 - multiplicação");
            System.out.println("x - sair");

            var oper = sc.next();
            String result = "";
            switch (oper) {
                case "1":
                    result = String.valueOf(num1 + num2);
                    break;
                case "2":
                    result = String.valueOf(num1 - num2);

                    break;
                case "3":
                    result = String.valueOf(num1 / num2);

                    break;
                case "4":
                    result = String.valueOf(num1 * num2);

                    break;
                case "x":
                    continuar = false;
                    break;
            }

            System.out.println("o Resultado é: " + result);
        } while (continuar);

    }
}