import java.util.Scanner;

public class OperadoresLogicosScanner {
    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in); //entrada de teclado

        int mes; //variável para armazenar numeral correspondente ao mês

        System.out.println("\nDigite o número referente ao mês para saber a condição!");
        System.out.println("\nJaneiro = [0] | Fevereiro = [1] | Março = [2] | Abril [3] | MAIO [4] | " +
                "Junho = [5] | Julho = [6]");
        System.out.println("Agosto = [7] | Setembro = [8] | Outubro = [9] | Novembro = 10 | Dezembro = [11]");

        System.out.println("\nDigite aqui o número:");

        mes=entrada.nextInt(); //entrada de teclado armazenada na variável mes

        //verificando qual mês o numeral corresponde
        if(mes == 0){
            System.out.println("O mês é janeiro");
        } else if(mes == 1){
            System.out.println("O mês é fevereiro");
        } else if (mes == 2){
            System.out.println("O mês é marco");
        } else if(mes == 3){
            System.out.println("O mês é abril");
        } else if (mes == 4){
            System.out.println("O mês é maio");
        } else if(mes == 5){
            System.out.println("O mês é junho");
        } else if (mes == 6){
            System.out.println("O mês é julho");
        } else if(mes == 7){
            System.out.println("O mês é agosto");
        } else if (mes == 8) {
            System.out.println("O mês é setembro");
        } else if (mes == 9){
            System.out.println("O mês é outubro");
        } else if(mes == 10){
            System.out.println("O mês é novembro");
        } else if (mes == 11){
            System.out.println("O mês é dezembro");
        }

        //verificando se o mês é um mês de férias
        if(mes == (0)) {
            System.out.println("Janeiro é mês de férias");
        } else if (mes == (5)) {
            System.out.println("Junho é mês de férias");
        } else if ( mes == (11)){
            System.out.println("Dezembro é mês de férias");
        } else {
            System.out.println("Não é mês de férias");
        }

    }
}
