package formasgeometricas;


public class Forma {
    
    protected String nome;
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome );
        System.out.println("Área: " + area());
    }
    
    public double area(){
        return 0;
    }
    
}
