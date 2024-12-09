import java.util.Scanner;

public class NumerosInvert {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int numerointervido = 0;

        // Loop para inverter os dígitos do numero
        while (numero != 0) { // laço vai continuar até que o número se torne zero.
            int digito = numero %10; //pega o último dígito do número. O operador % é o módulo, que calcula o resto da divisão do número por 10.
            numerointervido = numerointervido *10 + digito;
            numero /=10; //Aqui é onde ocorre a inversão
        }
        System.out.println("Número invertido: " + numerointervido);

        entrada.close();
    }
}