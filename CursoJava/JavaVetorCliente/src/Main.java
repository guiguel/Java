import entities.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema de cadastro de pessoas !");


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cliente[] cliente = new Cliente[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            cliente[i] = new Cliente(name, idade, altura);
            System.out.println("=================================");
        }

        for (int j = 0; j < cliente.length; j++) {
            Cliente cliente1 = cliente[j];
            System.out.println("Nome = " + cliente1.getNome() +
                    " Idade = " + cliente1.getIdade());
        }
        sc.close();
    }
}