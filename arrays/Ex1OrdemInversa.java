public class Ex1OrdemInversa{
    public static void main(String[] args){
        
        int[] vetor = {5,6,7,8,9,10,11,-6};

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count]+" ");
            count++;
        }

        System.out.println("\nVetor: ");
        for (int i = (vetor.length -1);i >=0;i--){
            System.out.print(vetor[i]+ " ");
        }



        System.out.println(" ");
    }    
}
