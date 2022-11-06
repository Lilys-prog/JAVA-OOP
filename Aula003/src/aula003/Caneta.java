
package aula003;
public class Caneta {
    // definir visibilidade dos atributos e dos métodos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    // void significa 'sem retorno'    
    public void status() {
        System.out.println("Modelo: " + this.modelo + ".");
        System.out.println("Uma caneta " + this.cor + ".");
        System.out.println("Está tampada? " + this.tampada + ".");
        System.out.println("Qual a ponta? " + this.ponta + ".");
        System.out.println("Carga: " + this.carga + "%.");
    }
    
    public void rabiscar() {
       if (this.tampada == true) {
           System.out.println("ERRO! Não posso rabiscar!");
       } else {             
           System.out.println("Estou rabiscando!");
       }
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
    
}
