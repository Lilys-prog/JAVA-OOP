
package exemploprático;

public class ExemploPrático {
    
        
    public static void main(String[] args) {
        
        ContaBanco conta1 = new ContaBanco(0.00f, false);
        
        conta1.abrirConta();
        conta1.depositar(300f);        
        conta1.setTipo("cp");        
        conta1.pagarMensal(); 
        conta1.setDono("Jubileu");        
        conta1.estado();
        
        System.out.println("=============================");
        
        ContaBanco conta2 = new ContaBanco(0.00f, false);
        
        conta2.abrirConta();
        conta2.depositar(500f);
        conta2.setTipo("cc");
        conta2.pagarMensal();
        conta2.setDono("Creuza");
        conta2.estado();
        
    }

}
