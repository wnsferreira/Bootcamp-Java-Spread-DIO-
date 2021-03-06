package com.company.arrays;

/*
Faça um programa que leia 20 números aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i=0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("\nNumeros aleatorios: ");
        for (int numero : numerosAleatorios){
            System.out.print((numero) + " ");
        }

        System.out.println("\nSucessores Numeros aleatorios: ");
        for (int numero : numerosAleatorios){
            System.out.print((numero+1) + " ");
        }
    }

}
