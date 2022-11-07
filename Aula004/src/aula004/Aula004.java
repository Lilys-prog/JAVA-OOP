// Aula prática 04 - métodos getter, setter e construct (07/11/2022)

package aula004;

public class Aula004 {    
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Vermelha", 0.7f); //parâmetros para o construtor
        c1.status();
        
        Caneta c2 = new Caneta("MontBlanc", "Preta", 0.5f);
        c2.status();
//        System.out.println("Tenho uma caneta " + c1.getModelo() + ".");
//        System.out.println("A ponta dela é de " + c1.getPonta() + "mm.");
    }    
}
