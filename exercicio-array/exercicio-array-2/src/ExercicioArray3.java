import java.util.Scanner;

public class ExercicioArray3 {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);

       int numero;
       int nMaior = 0;
       int nMedia = 0;
       int count = 0;
       int soma = 0;

       do{
           System.out.println("Digite um número: ");
           numero = scan.nextInt();
           soma = soma + numero;


             if(numero > nMaior) nMaior = numero;

           count = count + 1;
       } while (count < 5);
    System.out.println("Soma: " +soma);
    System.out.println("Média: " +(soma/5));
    System.out.println("Maior número: " +nMaior);

    }
}public class ExercicioArray3 {
    
}
