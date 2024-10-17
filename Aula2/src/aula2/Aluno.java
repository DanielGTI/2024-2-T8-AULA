package aula2;
public class Aluno {   
    //  ATRIBUTOS
    private double ra;  // PRIVADO
    private double av1;  // PRIVADO
    public double av2;  // PUBLICO
    
    //  MÉTODO CONSTRUTOR
    public Aluno(double ra, double av1, double av2) {
        this.ra = ra;
        this.av1 = av1;
        this.av2 = av2;
    }
    
    // GETTER = MÉTODO ACESSOR
    public double getRa() {
        return ra;
    }
    //  SETTER = MÉTODO MODIFICADOR
    public void setRa(double ra) {
        this.ra = ra;
    }
    
    public double getAv1(){
        if( this.av1 < 5.0 )
            return 0.0;
        else
            return av1;
    }
    
    public void setAv1(double av1){
        this.av1 = av1;
    }
    
    
    public void exibirInformacoes(){
        System.out.printf("%.0f\t %.2f\t %.2f\t\n",
                ra, av1, av2);
    }
    
}
