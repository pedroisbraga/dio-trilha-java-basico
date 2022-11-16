public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Resultado dos calculos´: ");
        Calculadora.soma(3 , 9);
        Calculadora.subtracao(3 , 7);
        Calculadora.multiplicacao(4, 5);
        Calculadora.divisao(25, 5);

        //Mensagem
        System.out.println("\n");
        System.out.println("Retorno da mensagem: ");
        Mensagem.mensagem(9);
        Mensagem.mensagem(15);
        Mensagem.mensagem( 2);

        //Emprstimos
        System.out.println("\n");
        System.out.println("Calculo de juros em empréstimos: ");
        Emprestimo.calculo(2000 , 2);
        Emprestimo.calculo(3000 , Emprestimo.duasParcelas());
        Emprestimo.calculo(2000 , 3);
        Emprestimo.calculo(3000 , Emprestimo.tresParcelas());
        Emprestimo.calculo(2000 , 4);
    }
}