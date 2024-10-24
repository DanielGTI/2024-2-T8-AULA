package aula4;
import java.util.*;

public class Aula4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        do{
            System.out.printf("\n-----------------------------------------\n");
            System.out.printf("\t|.. Menu de exemplos ..|\n");
            System.out.printf("\tOpcao 1: Exemplo de notas.\n");
            System.out.printf("\tOpcao 2: Exemplo de repeticao.\n");
            System.out.printf("\tOpcao 0: Sair do sistema.\n");
            System.out.printf("\nEscolha uma opcao: ");
            escolha = ler.nextInt();            
            switch(escolha){
                case 1:     notas();        break;
                //case 2:     repeticao();    break;
                //case 0:     sair();         break;
                
                default:    System.out.printf("Opcao invalida\n");
            }
        }while( escolha != 0 );        
        System.out.printf("\nObrigado por utilizar nosso sistema!\n");       
    }
    
    public static void notas(){
        Scanner ler = new Scanner(System.in);
        float av1, av2, av3, media;
        
        System.out.printf("Informe a nota da AV1: ");
        av1 = ler.nextFloat();
        System.out.printf("Informe a nota da AV2: ");
        av2 = ler.nextFloat();
        System.out.printf("Informe a nota da AV3: ");
        av3 = ler.nextFloat();
        
        media = valor_Media(av1, av2, av3); 
        System.out.printf("A media = %.2f\n", media);
        
        int media_menu;
        media_menu = (int) media;
        switch(media_menu){
            case 10:    System.out.printf("Parabens, nota MAXIMA!");        break;
            case 9:     System.out.printf("Otimo, quase a nota MAXIMA!");   break;
            case 8:     System.out.printf("Otimo dia, grande nota.");       break;
            case 7:     System.out.printf("Muito bem, podemos melhorar");   break;
            case 6:     System.out.printf("Aprovado (raspando.. haha)");    break;
            default:    System.out.printf("Aluno Reprovado! ");             break;       
        }      
    }
    
    public static float valor_Media(float nota1, float nota2, float nota3){
        float valorMedio=0;
        if( nota1 < nota2 && nota1 < nota3 ){
            valorMedio = (nota2 + nota3) / 2;
        }else
            if( nota2 < nota1 && nota2 < nota3 ){
                valorMedio = (nota1 + nota3) / 2;
            }else{
                valorMedio = (nota1 + nota2) / 2;
            }
        return valorMedio;
    }
}
