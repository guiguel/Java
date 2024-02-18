import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos número você vai armazenar ?");
        int n = sc.nextInt();

        int vet[] = new int[n];

        for (int i=0; i < n; i++){
            System.out.println("Digite um número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println("Números Negativos:");
        for (int j = 0; j < n; j++) {
            if(vet[j] < 0) {
                System.out.println("Valor negativo :"+ vet[j]);
            }
        }
        sc.close();//fechando o scanner
    }
}