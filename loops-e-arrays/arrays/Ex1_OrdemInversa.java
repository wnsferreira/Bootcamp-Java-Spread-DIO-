package com.company.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-3, -6, -4, 9, 8, 16};

        System.out.println("vetor: ");
        int count =0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nvetor: ");
        for (int i = (vetor.length -1); i >=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
