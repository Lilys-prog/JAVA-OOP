
package aula004;
public class Caneta {
    // definir visibilidade dos atributos e dos métodos
    private String modelo;    
    private float ponta;
    private String cor;
    private boolean tampada;
    
    // criando um método construtor, usa-se o mesmo nome da classe
    // desta formma, para encontrar esse método, basta procurar 
    // um com o mesmo nome da classe principal
//    public Caneta() {
//        this.tampar();
//        this.cor = "Azul";
//    }
// criando um construtor que recebe parâmetros:
    
    public Caneta(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    
    // usa-se o tipo 'String' pq se usar 'void' seria sem retorno   
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        // ao invés de 'this.modelo' pode-se usar 'this.getModelo().
        System.out.println("Ponta: " + this.ponta);
        // a mesma coisa para 'this.ponta'
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);        
    }    
}
