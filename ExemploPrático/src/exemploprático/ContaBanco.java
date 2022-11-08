// neste arquivo cria-se os atributos e métodos da classe
package exemploprático;

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;    
    private float deposito;
    private boolean status;

    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0.00f;
        this.status = false;
    }
    
    public void abrirConta() {
        status = true;
    }
    
    public void fecharConta() {
        if (saldo == 0) {
            status = false;
        }        
    }
    
    public void depositar() {
        if (status == true) {
            saldo += deposito;
        }
    }
    
}
