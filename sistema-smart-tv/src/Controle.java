public class Controle {
    
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("A TV está ligada?" +smartTv.ligada);
        System.out.println("Qual canal está?" +smartTv.canal);
        System.out.println("Qual volume da TV?" +smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Mudança de status --->" +smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Mudança de status --->" +smartTv.ligada);

        smartTv.setarCanal(22);
        System.out.println("Qual canal está?" +smartTv.canal);
    }
}
