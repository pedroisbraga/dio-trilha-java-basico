public class Vetor {
    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6};
        System.out.println("Vetor:");

        int count = 0;
        while (count <= (vetor.length-1)) {
            //while (count < (vetor.length)); Poderia ser escrito dessa forma.
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nO inverso do vetor é: ");
        for(int i = (vetor.length-1); i >= 0 ; i--) {
            System.out.println(vetor[i] + " ");
        }
    }