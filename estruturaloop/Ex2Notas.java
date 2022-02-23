import java.util.Scanner;

public class Ex2Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();
        while(nota < 0|nota>10){
            System.out.println("Nota invalida, digite novamente!");
            nota = scan.nextInt();
        }

        System.out.println("Continua aqui...");
    }
}
