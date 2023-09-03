package Abs_estr_dados.aulasLucas.introducaoJava;

import java.util.Scanner;

public class desafio1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero com 3 algarismo");
        int numero = sc.nextInt();
        int numeroInvertido = 0;
        while (numero > 0) {numeroInvertido = numeroInvertido * 10 + numero % 10;numero = numero / 10;}
        System.out.println(numeroInvertido);

    }
}

       