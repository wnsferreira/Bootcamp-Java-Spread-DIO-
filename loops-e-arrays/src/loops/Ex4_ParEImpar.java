package loops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares.
 */

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int quantNumero = 4;
        int soma = 0;

        int count = 0;
        int countPar = 0;
        int countImpar = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                countPar++;
            } else {
                countImpar++;
            }

            soma = numero + soma;
            count++;
        } while (count < quantNumero);

        System.out.println("Soma: " + soma);
        System.out.println("Par:" + countPar);
        System.out.println("Impar: " + countImpar);
    }
}
