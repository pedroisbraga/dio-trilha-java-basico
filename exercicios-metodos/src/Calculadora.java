public class Calculadora {
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("Resultado da soma: " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("Resultado da subtração: " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("Resultado da multiplicação: " + numero1 + " * " + numero2 + " = " + resultado);
    }

    public static void divisao(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("Resultado da divisao: " + numero1 + " / " + numero2 + " = " + resultado);
    }
}
