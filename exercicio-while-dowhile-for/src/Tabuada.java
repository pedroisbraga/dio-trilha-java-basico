import java.util.Scanner;

/* Calculadora de tabuada com uma entrada.
*/
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroTabuada;
        System.out.println("Calcule a tabuada de: ");
        numeroTabuada = scanner.nextInt();

        System.out.println("Tabuada de: " + numeroTabuada);

        for(int i =1; i<= 10; i++){
            System.out.println(numeroTabuada + "X" + i + "=: " + (numeroTabuada * i));

        }

    }
}
