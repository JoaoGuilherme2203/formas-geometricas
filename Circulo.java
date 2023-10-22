package formasgeometricas;


public class Circulo extends Forma {
    
    protected double raio;
    
    public Circulo( double raio ){
        this.raio = raio;
        super.nome = "Circulo";
    }
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome );
        System.out.println("Área: " + area());
    }
    
    public double area(){
        return 3.1415 * raio * raio;
    }
    
}
