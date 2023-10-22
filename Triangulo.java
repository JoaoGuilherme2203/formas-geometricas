package formasgeometricas;


public class Triangulo extends Forma {
    
    protected double base;
    protected double altura;
    
    public Triangulo( double base, double altura ){
        this.base = base;
        this.altura = altura;
        super.nome = "Triângulo equilátero";
    }
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome );
        System.out.println("Área: " + area());
    }
    
    public double area(){
        return (base * altura) / 2;
    }
    
}
