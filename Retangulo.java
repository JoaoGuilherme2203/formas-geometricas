package formasgeometricas;


public class Retangulo extends Forma {
    
    protected double base;
    protected double altura;
    
    public Retangulo( double base, double altura ){
        this.base = base;
        this.altura = altura;
        super.nome = "Retângulo";
    }
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome );
        System.out.println("Área: " + area());
    }
    
    public double area(){
        return base * altura;
    }
    
}
