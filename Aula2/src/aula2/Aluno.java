package aula2;

public class Aluno {
    
    //  ATRIBUTOS
    public double ra;
    public double av1;
    public double av2;
    
    //  MÉTODO CONSTRUTOR

    public Aluno(double ra, double av1, double av2) {
        this.ra = ra;
        this.av1 = av1;
        this.av2 = av2;
    }
    
    
    public void exibirInformacoes(){
        System.out.printf("%.0f\t %.2f\t %.2f\t\n", ra, av1, av2);
    }
    
}
