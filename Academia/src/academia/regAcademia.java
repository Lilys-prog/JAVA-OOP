package academia;
public class regAcademia {

    // atributos
    private String nomeAluno;
    private int regAluno;
    public int aulaMusc;
    public int aulaZumb;
    public int aulaAero;
    public int aulaLuta;
    private int horaAcademia;   
    private int persTrainer;
    private boolean agenda;       
    
    // área de métodos
    public regAcademia(String nomeAluno, int regAluno, boolean agenda) { // construtor
        this.setNomeAluno("");
        this.setRegAluno(-1);
        this.setAgenda(false);
    }
    
    public void status(){
        System.out.println(this.getHoraAcademia() + " horas.");
        System.out.println("Nome do aluno: " + this.getNomeAluno());
        System.out.println("Número de registro: " + this.getRegAluno());
        System.out.println("Agenda criada? " + this.getAgenda());        
        System.out.println("======================================");
    }
    
    public void matricular(String name, int reg) {      
      this.setNomeAluno(name);
      this.setRegAluno(reg);
      this.setAgenda(true);
    }
    
    public void agendar() {
        
    }  
    
    public String getNomeAluno() {
        return nomeAluno;
    }
    
    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getRegAluno() {
        return regAluno;
    }

    public void setRegAluno(int regAluno) {
        this.regAluno = regAluno;
    }

    public int getAulaMusc() {
        return aulaMusc;
    }

    public void setAulaMusc(int aulaMusc) {
        this.aulaMusc = aulaMusc;
    }

    public int getAulaZumb() {
        return aulaZumb;
    }

    public void setAulaZumb(int aulaZumb) {
        this.aulaZumb = aulaZumb;
    }

    public int getAulaAero() {
        return aulaAero;
    }

    public void setAulaAero(int aulaAero) {
        this.aulaAero = aulaAero;
    }

    public int getAulaLuta() {
        return aulaLuta;
    }

    public void setAulaLuta(int aulaLuta) {
        this.aulaLuta = aulaLuta;
    }

    public int getHoraAcademia() {
        return horaAcademia;
    }

    public void setHoraAcademia(int horaAcademia) {
        this.horaAcademia = horaAcademia;
        if (horaAcademia >= 6 && horaAcademia < 22) {
            System.out.println("Academia aberta!");                      
        } else {
            System.out.println("Academia fechada!");
        }
    }    

    public int getPersTrainer() {
        return persTrainer;
    }

    public void setPersTrainer(int persTrainer) {
        this.persTrainer = persTrainer;
    }

    public boolean getAgenda() {
        return agenda;
    }

    public void setAgenda(boolean agenda) {
        this.agenda = agenda;
    }


    
    
    
}



