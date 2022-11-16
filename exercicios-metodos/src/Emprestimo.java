public class Emprestimo {

    public static int duasParcelas() {
        return 2;
    }

    public static int tresParcelas() {
        return 3;
    }

    public static double txJurosDuasParcelas() {
        return 0.5;
    }

    public static double txJurosTresParcelas() {
        return 0.75;
    }

    public static void calculo(double valor, int parcelas) {

        if (parcelas == 2) {
            double resultado1 = valor + (valor * txJurosDuasParcelas());
            System.out.println("O montante do emprestimo para duas parcelas:" + resultado1);
        } else if (parcelas == 3) {
            double resultado2 = valor + (valor * txJurosTresParcelas());
            System.out.println("O montante do emprestimo para três parcelas:" + resultado2);
        } else
            System.out.println("Quantidade de parcelas não existe!");

    }
}
