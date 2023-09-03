package Abs_estr_dados.aulasLucas.array;
  public class desafio {
            public static void main(String[] args) {
            int i, j, aux;
            
            int v[]= new int[20];
            
            
            for (i=0; i< 20; i++)
            
            v[i] = i + 20;
            
            
            System.out.println();
            
            System.out.println("Vetor inicial");
            
            for (i=0; i< 20; i++) {
            
            System.out.print(v[i]);
            
            System.out.print(" ");

             
​​​​​for (i=0; i < 19; i++) {

  aux = v[i];
  
  v[i] = v[j];
  
  v[j] = aux;
  
  ​​​​​​​}
            }
            }
          }
    }         
   