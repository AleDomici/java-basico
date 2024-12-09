import java.util.Scanner;


public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int fatorial = 1; //não pode multiplicar por 0

        String expressao = "";

        // Loop while para calcular o fatorial
        for (int index = 1; index <= numero; index++) {
            fatorial *= index;

            if (index == numero) {
                expressao += index; //Não coloca  *  no último número
            } else {
                expressao += index + " * "; //coloca o * entre os numeros
            }
        }

        System.out.println(fatorial + " (" + expressao + ")");

        entrada.close();

    }
}