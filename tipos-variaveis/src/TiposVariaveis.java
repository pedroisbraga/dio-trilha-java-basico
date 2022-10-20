public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
    //tipos primitivos de dados
    //para descobrir minimo e máximo de cada variável usar as expressões tipo.MIN_VALUE ou tipo.MAX_VALUE    
    //Classe string representa texto na aplicação
    byte tipoByte = 123;
    short tipoShort = 30000;
    char tipoChar = 'c';
    float tipoFloat= 3.15f;
    double tipoDouble = 10.20;
    int tipoInt = 436785469;
    long tipoLong = 5436785469543678546L;
    boolean tipoBoolean = true;
    String meuNome = "Pedro Ivo";
    
    System.out.println("Valor do tipo byte = " + tipoByte);
    System.out.println("Valor do tipo short = " + tipoShort);
    System.out.println("Valor do tipo char = " + tipoChar);
    System.out.println("Valor do tipo float = " + tipoFloat);
    System.out.println("Valor do tipo double = " + tipoDouble);
    System.out.println("Valor do tipo int = " + tipoInt);
    System.out.println("Valor do tipo long = " + tipoLong);
    System.out.println("Valor do tipo boolean = " + tipoBoolean);
    System.out.println("Valor do mínimo int= " + Integer.MIN_VALUE);
    System.out.println("Valor do mínimo int= " + Integer.MAX_VALUE);
    System.out.println("Meu nome é: " + meuNome);
    }
}
