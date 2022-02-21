import java.util.Scanner;
public class Nome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome, sobrenome;

        System.out.println("Digite seu nome: ");
        nome = teclado.next();
        System.out.println("Digite seu Sobrenome: ");
        sobrenome = teclado.next();

        System.out.println("Seu nome é: "+nome+" "+sobrenome);
    }
}

