import java.util.Scanner;

public class NumerosPrimos {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt();

            boolean primo =  verificarPrimo(numero); //veridica se o numero é primo

            System.out.println(primo); // Exibe true se for primo, false caso contrário

            entrada.close();
        }

