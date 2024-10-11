package aula2;

public class Aluno {
    
    //  ATRIBUTOS
    private double ra;  // PRIVADO
    public double av1;  // PUBLICO
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

    public void setRa(double ra) {
        this.ra = ra;
    }
    
    
    
    public void exibirInformacoes(){
        System.out.printf("%.0f\t %.2f\t %.2f\t\n", ra, av1, av2);
    }
    
}
