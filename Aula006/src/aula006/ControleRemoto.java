package aula006;
// a ligação entre classe e cápsula já é declarada aqui no começo
// ao escrever implements o netbeans vai acusar erro. Clicando nele vai ter a opção "implementar todos os métodos abstratos". Clicando, ele vai fazer automaticamente.

public class ControleRemoto implements Controlador { 
    // atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // tinha esquecido o construtor
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    
    // métodos especiais (com o atalho ele usa 'is' ao invés de 'get' nos booleans. Por enquanto, substituir por 'get')
    // fazendo o exemplo com todos eles no modo privado. Por isso, não podem ser usados fora da classe, então só o uso dos métodos descritos no controlador e programados aqui. Os getters e setters estão sendo usados aqui, para criar os códigos que era abstratos na outra página.
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    // métodos abstratos: aqui é o que cada método da lista do controlador faz
    // o @Override significa sobrescrever. Significa que eu vou implementar os códigos que foram "definidos", mas não feitos na outra página. Eles não trazem mais a palavra 'abstrato' com eles
    // eu vou sobrescrever os códigos da página do controlador

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setVolume(0);
    }

    @Override
    public void abrirMenu() {
        System.out.println("------ Menu ------");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 1; i <= this.getVolume(); i += 10) {
            System.out.print(" | ");            
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar o volume, está desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossível diminuir o volume, está desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } 
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }   

// aqui termina a programação da classe, a partir de agora vamos verificar se o controle remoto funciona, poiis já foi feito o código, e a interface. Agora é só criar os objetos.  
    
}
