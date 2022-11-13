package aula006;
public class Aula006 {
    
    public static void main(String[] args) {
       ControleRemoto control1 = new ControleRemoto();
       control1.ligar();       
       control1.maisVolume();
       control1.maisVolume();
       control1.ligarMudo();
       control1.desligarMudo();
       control1.desligar();
       control1.play();
       control1.maisVolume();
       control1.abrirMenu();
    }

}
