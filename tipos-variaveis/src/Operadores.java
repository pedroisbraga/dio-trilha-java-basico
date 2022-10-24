public class Operadores {

    public static void main(String[] args) {
        double numero1 = 1;
        double numero2 = 2;

        boolean resultado = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("Essa condição é verdadeira!");
        }

        System.out.println("Os números são iguais?" + resultado);
        
        resultado = numero1 != numero2;

        System.out.println("Os números são diferentes?" + resultado);

        resultado = numero1 < numero2;

        System.out.println(" Número 1 é menor que Número 2?" + resultado);

        resultado = numero1 > numero2;

        System.out.println(" Número 1 é maior que Número 2?" + resultado);
    }
    
}
