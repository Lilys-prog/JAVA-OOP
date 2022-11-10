package academia;
public class Academia {    
    public static void main(String[] args) {
                
        regAcademia aluno1 = new regAcademia("", -1, false);        
        aluno1.matricular("José de Souza", 1);    
        aluno1.setHoraAcademia(8);
        aluno1.status();
        
        regAcademia aluno2 = new regAcademia("", -1, false);
        aluno2.matricular("Alira Paiva", 2);
        aluno2.setHoraAcademia(23);
        aluno2.status();
    }

}
