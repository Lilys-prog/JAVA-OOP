package academia;
public class regAcademia {

    // atributos
    private String nomeAluno;
    private int regAluno;    
    private int horaAcademia;     
    private boolean agenda;   
    private int zumba;
    private int aero;
    private int musc;
    private int luta;
    private int persTrainer;
    
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
        System.out.println("Aula de zumba: " + zumba + " horas");
        System.out.println("Aula de Aerohit: " + aero + " horas.");
        System.out.println("======================================");
    }
    
    public void matricular(String name, int reg) {      
      this.setNomeAluno(name);
      this.setRegAluno(reg);
      this.setAgenda(true);
    }
    
    public boolean getAgenda() {
        return agenda;
    }

    public void setAgenda(boolean agenda) {
        this.agenda = agenda;
    }
       
    public void agendar(int aero, int zumba, int musc, int luta, int persTrainer) {  
            this.setAero(aero);
            this.setZumba(zumba);
            this.setMusc(musc);
            this.setLuta(luta);
            this.setPersTrainer(persTrainer);
            if (aero == zumba || aero == musc || aero == luta || aero == persTrainer) {
                System.out.println("Você tem aulas marcadas para o mesmo horário. Verifique e atualize.");
            } else if (zumba == musc || zumba == luta || zumba == persTrainer) {
                System.out.println("Você tem aulas marcadas para o mesmo horário. Verifique e atualize.");
            } else if (musc == luta || musc == persTrainer) {
                System.out.println("Você tem aulas marcadas para o mesmo horário. Verifique e atualize.");
            } else if (luta == persTrainer) {
                System.out.println("Você tem aulas marcadas para o mesmo horário. Verifique e atualize.");
            } else {
                System.out.println("Agenda pronta!");
            }        
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

    public int getZumba() {
        return zumba;
    }

    public void setZumba(int zumba) {
        this.zumba = zumba;
    }

    public int getAero() {
        return aero;
    }

    public void setAero(int aero) {
        this.aero = aero;
    }

    public int getMusc() {
        return musc;
    }

    public void setMusc(int musc) {
        this.musc = musc;
    }

    public int getLuta() {
        return luta;
    }

    public void setLuta(int luta) {
        this.luta = luta;
    }

    public int getPersTrainer() {
        return persTrainer;
    }

    public void setPersTrainer(int persTrainer) {
        this.persTrainer = persTrainer;
    }

    
     
    
}



