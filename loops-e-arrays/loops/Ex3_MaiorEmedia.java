package loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
 */

import java.util.Scanner;

public class Ex3_MaiorEmedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = numero + soma;

            if (numero > maior) maior = numero;

            count++;
        } while (count < 5);

        media = soma / count;

        System.out.println("Maior: " + maior);
        System.out.println("Media: " + media);
    }
}
