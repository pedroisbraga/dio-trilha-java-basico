import java.util.Random;

public class NumerosAleatorios2 {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++){
            for (int coluna = 0; coluna < matriz[i].length; coluna++){
                matriz[i][coluna] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for (int colunaMatriz : linha) {
                System.out.print(colunaMatriz + " ");
            }
            System.out.println();
        }
    }
}
