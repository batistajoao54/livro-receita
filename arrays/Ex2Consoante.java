import java.util.Scanner;

public class Ex2Consoante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoante = 0;

        int count = 0;

        do{
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equals("a")|
                letra.equals("e")|
                letra.equals("i")|
                letra.equals("o")|
                letra.equals("u"))){
                consoantes[count] = letra;
                quantidadeConsoante++;
            }

            count++;

        }while(count < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes){
            if (consoante != null)
                System.out.println(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: "+ quantidadeConsoante);

    }
}
