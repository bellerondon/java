package listas;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        ArrayList<Trabalho>job = new ArrayList<>();
        ArrayList<Estudo>study = new ArrayList<>();
        ArrayList<Pessoal>my = new ArrayList<>();

        Trabalho newjob = new Trabalho(null, null, null,0);
        Estudo newstudy = new Estudo(null, null, null,0);
        Pessoal newmy = new Pessoal(null, null, null,0);

        int n, p;

        do {
            System.out.println("1-Trabalho\n2-Estudo\n3-Pessoal\n4-");
            n = Integer.parseInt(dados.nextLine());

        } while (n!=0);


        dados.close();
    }
}
