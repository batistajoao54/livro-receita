package hello;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
     
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.println("Digite um número");
        a = scan.nextInt();
        System.out.println("Digite outro número");
        b = scan.nextInt();

        int soma = soma(a,b);
        int sub = sub(a,b);

        System.out.println(soma);
        System.out.println(sub);
    }


    public static int soma(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return b - a;
    }
}