/*Elabore um programa Java que declare um vetor de strings com as seguintes 
frutas: "maçã", "banana", "laranja" e "uva". Primeiro, acesse e imprima o segundo 
elemento do vetor. Em seguida, modifique o terceiro elemento para "abacaxi" e 
imprima o terceiro elemento modificado. */

public class ativ3 {
       public static void main(String[] args) {
        String[] frutas = {"maçã", "banana", "laranja", "uva"};
        System.out.println(frutas[1]);
        frutas[2]="abacaxi";
        System.out.println(frutas[2]);
    }
}
