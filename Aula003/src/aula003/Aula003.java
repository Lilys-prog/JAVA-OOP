package aula003;
public class Aula003 {    
    public static void main(String[] args) {
// a classe "Caneta" vem na frente, e pronto, instanciou-se um objeto 'caneta'
        Caneta c1 = new Caneta();   
        
        // atributos
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;  // o netbeans do java já acusa o erro de visibilidade privada. Se mudar a visiblidade para public na classe o erro some e volta ao normal
        
        // na hora de digitar o atributo, pode-se ver uma 'chavinha' no nome do mesmo, por serem protegiddos, mas pode-se alterar o valor sem problema na execução
        c1.carga = 80;
        // c1.tampada = true; // deu erro pq agora é privado.
// apesar de o atributo tampada ser privado e não poder ser mexido, os métodos 'tampar()' e 'destampar()' são públicos e eles permitem o acesso ao atributo privado e sua modificação. Ou seja, valendo-se desses métodos pode-se definir se a caneta está tampada ou não, apesar de não se poder mexer diretamente no atributo privado. Isso acontece porque quando um atributo ou método são privados, os únicos que podem mexer neles são a própria classe. O atributo 'tampada' está sendo mexido pelos métodos públicos presentes na classe 'Caneta', tampar() e destampar().
        c1.destampar();
        c1.status();     // referência a método (usa parênteses)             
    }    
}

// o método main está dentro de uma classe que está usando a classe 'Caneta'. O método principal é o psvm, lá no começo e a classe principal é a 'public class Aula003'. Dentro dela se coloca o psvm e a classe 'Caneta'. Dentro desse método main, da classe Aula003 eu não consigo mexer em nenhum atributo ou método que esteja descrito como 'private'
