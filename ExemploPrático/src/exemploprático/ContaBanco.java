// neste arquivo cria-se os atributos e métodos da classe
package exemploprático;
import java.util.Random;

public class ContaBanco {
    
    public int numConta;
    public String cc;
    public String cp;
    public int num;
    protected String tipo;
    private String dono;
    private float saldo;    
    private float val;
    private boolean status;

    // método construtor
    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0.00f;
        this.status = false;
    }    
    
    public void abrirConta() {
        status = true;        
    }    
    
    public void fecharConta() {
        if (saldo == 0f) {
            status = false;
        } else {
            System.out.println("A conta não pode ser fechada pois possui saldo ou dívida em aberto."); 
        }        
    }
    
    public void depositar(float val) {
        if (status == true) {
            saldo += val;            
        } else {
            System.out.println("Não existe conta para fazer o depósito");
        }                 
    }
    
    public void sacar(float val) {
        if ((status == true) && (saldo > 0f)) {
           saldo -= val; 
        }        
    }  
    
    public void pagarMensal() {
        if (tipo == "Conta Corrente") {
            saldo -= 12f;            
        } else if (tipo == "Conta Poupança"){
            saldo -= 20f;
        }        
    }
    
    public void setStatus(boolean status) {
        this.status = status;                
    }
    
    public boolean getStatus() {
        return this.status;
    }
        
    public void setNumConta(int num) {        
        this.numConta = num;
    }
        
    public int getNumConta() {
        return this.numConta;                
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
        if (status == true){
           if (tipo == "cc") {
                this.tipo = "Conta Corrente";
                saldo += 50f;
            } else if (tipo == "cp") {
                this.tipo = "Conta Poupança";
                saldo += 150f;
            } 
        } else {
            this.tipo = "Não existe esse tipo de conta no banco.";
            saldo = 0;
        }        
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float getSaldo() {
        return this.saldo;
    }
    
    
   // método para mostrar os dados da conta
    public void estado() {
        System.out.println("A conta está aberta? " + this.getStatus() + ".");
        System.out.println("O número da conta é " + this.getNumConta() + ".");
        System.out.println("O tipo de conta é " + this.getTipo() + ".");
        System.out.println("O dono desta conta é " + this.getDono() + ".");
        System.out.println("O saldo em conta é de " + this.getSaldo() + " reais.");   
    }   
}
