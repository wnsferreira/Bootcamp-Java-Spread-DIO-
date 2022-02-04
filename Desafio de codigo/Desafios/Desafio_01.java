package Desafios;

import java.util.Scanner;

public class Desafio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Linha: ");
        int L = sc.nextInt();
        System.out.println("Coluna: ");
        int C = sc.nextInt();
        if (( C%2 != 0   )  &  L%2 ==0)
            System.out.println("  0 preto ");
        else                                               //complete o código nos espaços em branco
            System.out.println("  1 branco");
        sc.close();
    }
}