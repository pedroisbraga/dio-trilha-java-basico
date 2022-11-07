public class SwitchTest {
    public static void main (String [] args){
    int day = 1;

    switch (day) {
       
        case 1:
            System.out.println("O dia é segunda-feira");
            break;
        case 2:
            System.out.println("O dia é terça-feira");
            break;
        case 3:
            System.out.println("O dia é quarta-feira");
            break;
        case 4:
            System.out.println("O dia é quinta-feira");
            break;
        case 5:
            System.out.println("O dia é sexta-feira");
            break;
            
        default:
            System.out.println("Não é dia útil");
        }
    }
}
