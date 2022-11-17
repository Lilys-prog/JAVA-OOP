package aula007;
public class Lutador {
    // atributos(eles são como variáveis). Cada um deles vai receber um nome normal e um nome para representar o parâmetro que serão as duas primeiras letras de cada nome normal (para o construtor)    
    private String nome; // no
    private String nacionalidade; // na
    private int idade; // id
    private float altura; // al
    private float peso; // pe
    private String categoria; // não vai receber sigla pq vai ser definida dentro de peso
    private int vitorias; // vi
    private int derrotas; // de
    private int empates; // em
    
    // métodos(são como funções ou rotinas de algoritmo). Não fiz sozinha pq não sabia o que o Guanabara queria, então esperei ele fazer
    // primeiramente o método construtor
    // peso está apresentado de maneira diferente pq ele vai ser usado de maneira diferente
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        // tinha esquecido de colocar os 'this.'
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe); // categorias vai ser definido dentro dessa função
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    
    //métodos setters e getters
    public String getNome() {
        return nome;        
    }
    
    public void setNome(String no) {
        this.nome = no;
    }
    
    public String getNacionalidade() {
        return nacionalidade;
    }
    
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int id) {
        this.idade = id;
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAltura(float al) {
        this.altura = al;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }
    
    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Peso inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Peso Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Peso inválido";
        }
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public int getVitorias() {
        return vitorias;
    }
    
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }
    
    public int getDerrotas() {
        return derrotas;
    }
    
    public void setDerrotas(int de) {
        this.derrotas = de;
    }
    
    public int getEmpates() {
        return empates;
    }
    
    public void setEmpates(int em) {
        this.empates = em;
    }
    
    // métodos específicos da classe Lutador
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    public void apresentar() {
        System.out.println("--------------------------------------------------");
        System.out.println("Deste lado do ringue temos " + this.getNome());
        System.out.println("Representando seu país: " + this.getNacionalidade());
        System.out.println("Com apenas " + this.getIdade() + " anos");
        System.out.println("Uma altura de " + this.getAltura() + "m");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println("Na categoria " + this.getCategoria());
        System.out.println("Tendo " + this.getVitorias() + " vitória(s), " + this.getDerrotas() + " derrota(s) e " + this.getEmpates() + " empate(s)!");
    }
    
    public void status() {
        System.out.println(this.getNome());
        System.out.println(this.getCategoria());
        System.out.println(this.getVitorias() + " vitória(s)");
        System.out.println(this.getDerrotas() + " derrota(s)");
        System.out.println(this.getEmpates() + " empate(s)");
    }

}
