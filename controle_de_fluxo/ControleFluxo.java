import java.util.Scanner;

public class ControleFluxo {
    public static void main(String[] args) {
        int valor = 301;
        switch(valor){
            case 300:
                System.out.println("errado");
                break;
            case 234:
                System.out.println("certo");
                break;
            default:
                System.out.println("não deu certo");   
        }
    }          
}
