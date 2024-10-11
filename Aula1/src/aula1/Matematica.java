package aula1;

public class Matematica {
    //  ATRIBUTOS
    double a, b;
        
    //  MÉTODOS
    //  Método Construtor
    public Matematica(double valor1, double valor2) {
        this.a = valor1;
        this.b = valor2;
    }
    
    //  Método soma
    public double somar(){
        return (this.a + this.b);
    }
    //  Método Subtrair
    public double subtrair(){
        return (this.a - this.b);
    }
    //  Método Multiplicar
    public double multiplicar(){
        return (this.a * this.b);
    }
    //  Método Dividir
    public double dividir(){
        return (this.a / this.b);
    }
    
    // IMC
    public double imc(double altura, double peso){
        return ( altura / (peso * peso) );
    }
}

