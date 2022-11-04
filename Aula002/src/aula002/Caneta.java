
package aula002;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // void significa 'sem retorno'
    
    void status() {
        System.out.println("Modelo: " + this.modelo + ".");
        System.out.println("Uma caneta " + this.cor + ".");
        System.out.println("Está tampada? " + this.tampada + ".");
        System.out.println("Qual a ponta? " + this.ponta + ".");
        System.out.println("Carga: " + this.carga + "%.");
    }
    
    void rabiscar() {
       if (this.tampada == true) {
           System.out.println("ERRO! Não posso rabiscar!");
       } else {             
           System.out.println("Estou rabiscando!");
       }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
}
