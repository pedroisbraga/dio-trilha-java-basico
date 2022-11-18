import java.util.Scanner;

public class Desafio {


        public static void main(String[] args) {

            //TODO: Imprima se os valores numéricos passados são iguais ou não.
            Scanner scan = new Scanner (System.in);

            System.out.println ("Digite dois números para verificar igualdade: ");
            System.out.println ("Digite o primeiro número: : ");
            int a = scan.nextInt();
            System.out.println ("Digite o segundo número: : ");
            int b = scan.nextInt();

            if (a == b) {
                System.out.println ("Sao iguais!");
            } else
                System.out.println ("Não sao iguais!");

        }
}

