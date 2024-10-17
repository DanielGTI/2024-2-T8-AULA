package aula2;
import java.util.*;

public class Turma {
    
    private List<Aluno> alunos;
    public Turma(){
        alunos = new ArrayList();
    }
    
    public void adicionarAluno( Aluno aluno ){
        alunos.add(aluno);
    }
    
    public Aluno buscarAlunoPorRA(double ra){
        for( Aluno aluno : alunos){
            if (aluno.getRa() == ra ){
                return aluno;
            }                
        }
        return null;
    }
    public void exibirTurma(){
        System.out.printf("RA\t  AV1\t AV2\n");
        for( Aluno aluno : alunos){
            aluno.exibirInformacoes();
        }
    }
}
