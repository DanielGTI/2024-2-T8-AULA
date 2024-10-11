package aula2;


public class Aula2 {


    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(20241234, 7.0, 9.0);
        
        aluno1.exibirInformacoes();
        
        aluno1.setRa(2000123);
        
        System.out.printf("RA: %.0f\nAV1: %.2f\nAV2: %.2f\n", aluno1.getRa(), aluno1.av1, aluno1.av2);
    }
    
}
