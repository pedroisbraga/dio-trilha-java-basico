public class OperadoresLogicos {
    public static void main(String[] args) throws Exception{

        //Testando operadores lógicos
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1&&b2));
        System.out.println("b1 && b3: " + (b1&&b3));

        System.out.println("b2 || b3: " + (b2||b3));
        System.out.println("b3 || b4: " + (b3||b4));

        System.out.println("b1 ^ b2: " + (b1^b2));
        System.out.println("b1 ^ b3: " + (b1^b3));

        System.out.println("!b1: " + (!b1));
        System.out.println("!b2: " + (!b2));

        //Cálculo com expressões e operadores lógicos
        System.out.println("--------------------------------------------------------");
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((i1+i2)<(f2-f1)) && true: " + (((i1+i2)<(f2-f1)) && true));
        System.out.println("((i1>i2) || (f2<f1)) && true: " + ((i1>i2) || (f2<f1)));

        //Cálculo com base em média salarial
        System.out.println("--------------------------------------------------------");
        double salarioMensal = 12000.00d;
        double mediaSalarial = 10500.00d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalarial) && (quantidadeDependentes >=mediaDependentes));

        boolean salarioBaixo = salarioMensal<mediaSalarial;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.println("Recebe auxílio? " + recebeAuxilio);
    }
}
