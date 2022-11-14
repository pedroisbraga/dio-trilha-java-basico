import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Calculo de fatorial

        System.out.println("Calcule o fatorial de: ");
        int fatorial = scan.nextInt();
        System.out.println("O fatorial de " + fatorial + "é: ");

        int multiplicacao = 1;

        for(int i = fatorial; i >=1 ; i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);

    }
}
