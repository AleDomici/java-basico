import java.util.Scanner;

public class BinarioparaDecimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número binário: ");
        String binario = entrada.next();

        int decimal = 0;
        int base = 1;  // A base da posição dos dígitos no binário

        for (int i = binario.length() -1; i >= 0; i--) { //Converte o número binário (representado por 'binario') para decimal
            if (binario.charAt(i) == '1') {
                decimal += base; // Adiciona a potência de 2 ao decimal se o bit for '1'
            }
            base *=2; // Multiplica a base por 2 a cada iteração (potências de 2)
        }
        System.out.println("O número decimal  é: " + decimal);

        entrada.close();
    }
}
