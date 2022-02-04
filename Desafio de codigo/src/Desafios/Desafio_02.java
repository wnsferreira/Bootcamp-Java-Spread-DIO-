package Desafios;

import java.util.Scanner;

public class Desafio_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qtd de casas no tabuleiro: ");
        int n = sc.nextInt();

        int qtdGraos = 2;

        for(int i=1 ; i<n ; i++) {
            qtdGraos = qtdGraos^i;
            System.out.printf(" " + qtdGraos);
        }
        System.out.println(qtdGraos);
        sc.close();
    }
}
