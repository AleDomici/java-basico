import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int soma = 0;

        String expressao = "";

        // Loop for para calcular a soma de 1 a numero
        for (int index = 1; index <= numero; index++) {
            soma += index;

            if (index == numero) {
                expressao += index; //Não coloca  +  no último número
            } else {
                expressao += index + " + "; //coloca o + entre os numeros
            }
        }


    }
}