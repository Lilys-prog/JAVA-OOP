package aula003;
public class Aula003 {    
    public static void main(String[] args) {
// a classe "Caneta" vem na frente, e pronto, instanciou-se um objeto 'caneta'
        Caneta c1 = new Caneta();   
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5;   // o netbeans do java já acusa o erro de visibilidade privada
        c1.status();     // referência a método (usa parênteses)             
    }    
}
