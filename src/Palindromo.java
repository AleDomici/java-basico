import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        int original = numero;
        int invertido = 0;

        //loop que inverte o numero
        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero /=10;
        }

    }
}
