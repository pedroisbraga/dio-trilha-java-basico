
//Criando classe carro
class Carro {

    //criando atributos da classe carro (Substantivo/adjetivo)
    String cor;
    String modelo;
    int capacidadeDoTanque;

    //Construtor
    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeDoTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return  modelo;
    }

    void setCapacidadeDoTanque(int capacidadeDoTanque){
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    int getCapacidadeDoTanque(){
        return capacidadeDoTanque;
    }

    double totalValorCombustivel(double totalValorCombustivel){
        return totalValorCombustivel * capacidadeDoTanque;
    }
}
