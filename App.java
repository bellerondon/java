/*Elabore um programa que leia um vetor de 
5 números digitados pelo usuárioe uma variável de um número 
n qualquer, depois mostre na tela
 o índice doselementos que são inferiores a n. */

 import java.util.Scanner;

 public class App {
    public static void main(String[] args) throws Exception {
      
        int[] numeros = new int [5];
            
        Scanner leitor = new Scanner(System.in);
       
        System.out.println("----digite 5 numeros---");
       
        for(int i = 0; i < numeros.length; i++){
          System.out.print("digite o numero (" + (i+1) + ") :");
          numeros[i] = Integer.parseInt(leitor.nextLine());
          }

        Scanner n = new Scanner(System.in);
        
        System.out.print("escreva o valor de n :");
        int num = n.nextInt();

        for(int i = 0; i < numeros.length; i++){
           if(numeros[i] < num){
           System.out.println("indice : "+  i + " numero do vetor : " + numeros[i]);

           }  

        }
    }
}
