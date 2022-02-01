package loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo:
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 5;
        int result;

        for(int i=1; i<=10; i++){
            result = numero*i;
            System.out.println(numero + "*" + i + "=" + result);
        }
    }
}

