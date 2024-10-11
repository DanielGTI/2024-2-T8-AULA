package aula1;
import java.util.Scanner;
public class Aula1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a, b;
        System.out.printf("Digite o primeiro valor: ");
        a = ler.nextDouble();
        System.out.printf("Digite o segundo valor: ");
        b = ler.nextDouble();

        Matematica calcular = new Matematica(a,b);
        System.out.printf("Soma = %.2f\n", calcular.somar());
        System.out.printf("Subtrair = %.2f\n", calcular.subtrair());
        System.out.printf("Multiplicar = %.2f\n", calcular.multiplicar());
        System.out.printf("Dividir = %.2f\n", calcular.dividir());
        
        System.out.printf("Digite o seu peso: ");
        a = ler.nextDouble();
        System.out.printf("Digite a sua altura: ");
        b = ler.nextDouble();

        System.out.printf("IMC = %.2f\n", calcular.imc(a,b));
    }
    
}
