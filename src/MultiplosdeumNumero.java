import java.util.Scanner;

public class MultiplosdeumNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número n: ");
        int n = entrada.nextInt();

        System.out.print("Digite o número m: ");
        int m = entrada.nextInt();

        System.out.print("Múltiplos de " + n + " até " + m + ": ");

                //loop for que imprime os multiplos
        for (int i = n; i <= m; i+= n){
            System.out.print(i);
            if(i + n <= m) {
                System.out.print(", ");
            }
        }
        System.out.println();

        entrada.close();
    }
}
