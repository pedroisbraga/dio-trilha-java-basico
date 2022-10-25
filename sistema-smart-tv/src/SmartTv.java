import java.security.NoSuchProviderException;

public class SmartTv {
            
        boolean ligada =false;
        int canal = 7;
        int volume = 25;
        
        public void ligar(){
            ligada = true;
        }

        public void desligar(){
            ligada = false;
        }

        public void aumentarVolume(){
            volume++;
            System.out.println("Aumentando o volume para:" + volume);
        }

        public void diminuirVolume(){
            volume--;
            System.out.println("Diminuindo o volume para:" + volume);
            
        }

        public void setarCanal(int novoCanal){
            canal = novoCanal;
        }
        
        public void aumentarCanal(){
            canal++;
            System.out.println("UP:" + canal);
            
        }

        public void diminuirCanal(){
            canal--;
            System.out.println("DOWN:" + canal);
            
        }
}
