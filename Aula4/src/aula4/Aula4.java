package aula4;
import java.util.*;

class GlobalVariaveis{

    static int quina[][]= new int [10][5];
    
    public static void realizarQuina(){
        for(int i=0; i<10; i++){
            for( int j=0; j<5; j++){
                quina[i][j] = Aula4.num_sorteio();
                //System.out.printf("%02d - ", GlobalVariaveis.quina[i][j]);
            }
            Arrays.sort(quina[i]);
        }   
         
    }
}    
public class Aula4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;
        do{
            System.out.printf("\n-----------------------------------------\n");
            System.out.printf("\t|.. Menu de exemplos ..|\n");
            System.out.printf("\tOpcao 1: Exemplo de notas.\n");
            System.out.printf("\tOpcao 2: Exemplo de repeticao.\n");
            System.out.printf("\tOpcao 3: Exemplo de controles.\n");
            System.out.printf("\tOpcao 4: Novos Sorteios.\n");
            System.out.printf("\tOpcao 5: Listar sorteios.\n");
            System.out.printf("\tOpcao 0: Sair do sistema.\n");
            System.out.printf("\nEscolha uma opcao: ");
            escolha = ler.nextInt();            
            switch(escolha){
                case 1:     notas();            break;
                case 2:     repeticao();        break;
                case 3:     controle();         break;
                case 4:     sorteio();          break;
                case 5:     listar_sorteio();   break;
                case 0:     sair();             break;
                
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

    
    public static void listar_sorteio(){
        
        
        System.out.println("\n-------------------------------------");
        System.out.println("Listar sorteio\n");
       
        for(int i=0; i<10; i++){
            for( int j=0; j<5; j++){
                if( j < 4 )
                    System.out.printf("%02d - ", GlobalVariaveis.quina[i][j]);
                else
                    System.out.printf("%02d", GlobalVariaveis.quina[i][j]);
            }
            System.out.println("");
        } 
    }
   
    public static void sair(){
        System.out.println("\n-------------------------------------");
        System.out.println("Obrigado por utilizar o nosso sistema\n");
        System.out.println("Até breve.\n");
    }
    
    public static void repeticao(){
        /*
            Do While(??)    // REPITA
            While(??)       // ENQUANTO 
            For(???)        // PARA 
        */
        int x = 1;
        do{
            System.out.println("do while() " + x);
            x++;
        }while( x<=10 );
        
        x = 1;
        while( x<=10 ){
            System.out.println("while() " + x);
            x++;
        }
        
        for( x=1; x<=10; x++ ){
            System.out.println("for() " + x);
        }
    }
    
    public static void controle(){
        System.out.println("\nMetodo de controle\n");
    }


        
    public static int num_sorteio(){
        Random num_aleatorio = new Random();
        int numero = (num_aleatorio.nextInt(60))+1;
        return numero;
    }
    
    public static void sorteio(){
        
        GlobalVariaveis.realizarQuina();
        listar_sorteio();     
        
        /*int i;
        int bingo[] = new int[5];
        
        System.out.print("\nSorteio do bingo (ultimo sorteio):\n");
        
        for( i=0; i<5; i++){
            bingo[i] = GlobalVariaveis.quina[9][i];
            System.out.print("Numero gerado (" + (i+1) + "): " + bingo[i] + "\n");
        }
        */
        
    }
}
