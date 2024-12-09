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

        //função para verificar se é primo
        public static boolean verificarPrimo(int numero) {
            if (numero <= 1) {
                return false; //verifica se o numero é menor ou igual a 1 pois não sao primos
            }

            for (int i = 2; i <= Math.sqrt(numero); i++){ // calcula a raiz quadrada do numero
                if (numero % i ==0) {
                    return false; // Se for divisível por algum número, não é primo
                }
            }
            return true; //se não for divisivel, é primo
        }
    }