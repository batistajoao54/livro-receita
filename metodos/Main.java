public class Main {
    public static void main(String[] args){

        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 8.4);
        Calculadora.multiplocacao(5, 10);
        Calculadora.divisao(26, 2);


        //Mensagem
        System.out.println("Exercicio Mensagem");
        Menssagem.obterMensagem(9);
        Menssagem.obterMensagem(14);
        Menssagem.obterMensagem(1);

        //Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
