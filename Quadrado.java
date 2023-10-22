package formasgeometricas;


public class Quadrado extends Forma {
    
    protected double lado;
    
    public Quadrado( double lado ){
        this.lado = lado;
        super.nome = "Quadrado";
    }
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome );
        System.out.println("Área: " + area());
    }
    
    public double area(){
        return lado * lado;
    }
    
}
