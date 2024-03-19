
/*Faça um programa que leia em um vetor uma sequência 
finita de númerosdigitados pelo usuário. Crie um segundo 
vetor que armazene o dobro de cadanúmero do primeiro vetor e depois apresente os valores deste vetor */
import java.util.Scanner;

class Int {
    
    public static void Att1(String[] args) {
        
      int[] numeros = new int [5];
            
      Scanner leitor = new Scanner(System.in);
     
      System.out.println("----digite 5 numeros---");
     
      for(int i = 0; i < numeros.length; i++){
        System.out.print("digite o numero (" + (i+1) + ") :");
        numeros[i] = Integer.parseInt(leitor.nextLine());
        }
      
      int[]segundo = new int [numeros.length];
      
      for(int i = 0; i < numeros.length; i ++){
        segundo[i] = numeros[i] * 2;
        System.out.print("os numeros x 2 é : " + segundo[i] + "\n");
      }
    }
}
