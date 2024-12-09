import java.util.Scanner;
public class ContagemdeDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        // Variável para contar os dígitos
        int contador = 0;

        //verifica se o número é zero, pois zero tem 1 digito
        if (numero ==0){
            contador = 1;
        } else {
            //loop while para contar digitos
            while (numero != 0) {
                numero /= 10; //divide o numero por 10
                contador++; //adiciona o contador
            }
        }
    }