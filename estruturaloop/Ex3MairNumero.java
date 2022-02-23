import java.util.Scanner;

public class Ex3MairNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, maior = 0, soma = 0, count = 0;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
            count = count + 1;
        }while(count < 5);
        
        System.out.println("Maior: "+maior);
        System.out.println("Média: "+(soma/5));
    }

}
