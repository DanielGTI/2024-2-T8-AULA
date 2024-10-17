package aula2;
import java.util.*;
public class Aula2 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        Random gerar = new Random();
        Turma turma = new Turma();
        double ra, av1, av2;
        
        // Gerar dados dos alunos
        for( int i=0; i<10; i++){
            ra = (gerar.nextInt(1000)) + 240000;
            av1 = gerar.nextInt(11);
            av2 = gerar.nextInt(11);
            turma.adicionarAluno(new Aluno(ra, av1, av2));
        }      
        //  EXIBIR TURMA
        turma.exibirTurma();
        
        
        /*
        Aluno aluno1 = new Aluno(20241234, 3.0, 9.0);
        aluno1.exibirInformacoes();
        aluno1.setRa(2000123);
        System.out.printf("RA: %.0f\nAV1: %.2f\nAV2: %.2f\n", 
                aluno1.getRa(), aluno1.getAv1(), aluno1.av2);
        */
    }
    
}
