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
    private int agenda;
    
    // área de métodos
    public regAcademia(String nomeAluno, int regAluno, int agenda) { // construtor
        this.nomeAluno = nomeAluno;
        this.regAluno = regAluno;
        this.agenda = agenda;
    }
    public matricular() {
        
    }
    public agendar() {
        
    }
    public mensalidade() {
        
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
    }

    public int getPersTrainer() {
        return persTrainer;
    }

    public void setPersTrainer(int persTrainer) {
        this.persTrainer = persTrainer;
    }

    public int getAgenda() {
        return agenda;
    }

    public void setAgenda(int agenda) {
        this.agenda = agenda;
    }


    
    
    
}



