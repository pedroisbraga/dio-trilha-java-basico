public class AboutMe {
    public static void main(String[] args) throws Exception {

       String nome = args [0];
       String sobrenome = args [1];
       int idade = Integer.valueOf(args[2]);
       double altura = Double.valueOf(args[3]);

        // String nome = "Pedro" ;
       // String sobrenome = "Braga" ;
       // int idade = 30 ;
        //double altura = 1.69 ;

        System.out.println("Olá, me chamo" + nome + sobrenome);
        System.out.println("Tenho" + idade +"anos");
        System.out.println("Minha altura é" + altura + "cm");
    }
}
