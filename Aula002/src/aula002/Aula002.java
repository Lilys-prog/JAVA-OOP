package aula002;
public class Aula002 {    
    public static void main(String[] args) {
// a classe "Caneta" vem na frente, e pronto, instanciou-se um objeto 'caneta'
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 80;   // referência a atributo (sem parênteses)    
        c1.tampar();               
        c1.status();     // referência a método (usa parênteses)
        c1.rabiscar();
        
        // instanciando um novo objeto 'caneta'
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();        
        // aqui se está trabalhando com 2 instâncias ou 2 objetos instanciados.        
    }    
}
