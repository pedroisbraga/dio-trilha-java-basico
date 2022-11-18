public class RodarAplicacao {
    public static void main(String[] args) {

        System.out.println("\nTeste carro 1:" );
        Carro carro1 = new Carro();
        carro1.setCor("Preta");
        carro1.setModelo("Celta");
        carro1.setCapacidadeDoTanque(55);

        System.out.println("A cor do carro é: " + carro1.getCor());
        System.out.println("O modelo do carro é: " + carro1.getModelo());
        System.out.println("A capacidade do tanque é: " + carro1.getCapacidadeDoTanque());
        System.out.println("Custo total para encher o tanque: "+ carro1.totalValorCombustivel(5.40));

        System.out.println("\nTeste carro 2:" );

        Carro carro2 = new Carro("Cinza", "Corsa", 50);
        System.out.println("A cor do carro é: " + carro2.getCor());
        System.out.println("O modelo do carro é: " + carro2.getModelo());
        System.out.println("A capacidade do tanque é: " + carro2.getCapacidadeDoTanque());
        System.out.println("Custo total para encher o tanque: "+ carro2.totalValorCombustivel(5.40));

    }
}
