import java.util.Scanner;

public class HelloWord{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a, b;

        System.out.println("Digite um numero: ");
        a = scan.nextInt();
        System.out.println("Digite outro numero");
        b = scan.nextInt();

        int soma = soma(a,b);
        int subtracao = subtracao(a, b);

        System.out.println(soma);
        System.out.println(subtracao);
    }

    public static int soma(int a, int b){
        return a + b;
    }

    public static int subtracao(int a, int b){
        return a - b;
    }
}