import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = entrada.nextInt();

        System.out.print("Digite o expoente: ");

        int expoente = entrada.nextInt();

        int resultado = 1;

        //loop for
        for (int i =1; i <= expoente; i++) {
            resultado *= base;
        }

        System.out.println(base + "^" + expoente + "=" + resultado);

        entrada.close();
    }
}
