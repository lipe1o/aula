public class alunos extends pessoas{
    private int numero_matricula;
    private String curso;

    public void setNM(int nm){
        this.numero_matricula=nm;
    }
    public int getNM(){
        return this.numero_matricula;
    }
    public void setCurso(String curso1){
        this.curso=curso1;
    }
    public String getCurso(){
        return this.curso;
    }

}
