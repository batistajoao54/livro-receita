package hello.e_ai;

import java.util.Scanner;

public class hello {
    public static void main(String args []){
        Scanner leitor = new Scanner(System.in);
        float n,m;
        System.out.println("Digite um número");
        n = leitor.nextFloat();
        System.out.println("Digite outro número");
        m = leitor.nextFloat();

        float mul = mul(m,n);
        float div = div(m,n);

        System.out.println(mul);
        System.out.println(div);

    }
    public static float mul(float m, float n){
        return m*n;
    }
    public static float div(float n, float m){
        return n/m;
    }


}
