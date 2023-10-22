package formasgeometricas;
import java.util.Scanner;


public class FormasGeometricas {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        Forma f;
        
        int op;

        do{
            System.out.println("Escolha uma forma para calcular a área:");
            System.out.print("1-Circulo 2-Quadrado 3-Retângulo 4-Triângulo");
            op = input.nextInt();
            
            switch( op ){
                case 1 -> {
                    double raio;
                    System.out.println("Informe o raio do circulo: ");
                    raio = input.nextDouble();
                    f = new Circulo( raio );
                    f.mostrar();
                }

                case 2 -> {
                    double lado;
                    System.out.println("Informe a medida do lado do quadrado: ");
                    lado = input.nextDouble();
                    f = new Quadrado( lado );
                    f.mostrar();
                }

                case 3 -> {
                    double base, altura;
                    System.out.println("Informe a medida da base do retângulo: ");
                    base = input.nextDouble();
                    System.out.println("Informe a medida da altura do retângulo: ");
                    altura = input.nextDouble();
                    f = new Retangulo( base, altura );
                    f.mostrar();
                }

                case 4 -> {
                    double base, altura;
                    System.out.println("Informe a medida da base do triângulo: ");
                    base = input.nextDouble();
                    System.out.println("Informe a medida da altura do triângulo: ");
                    altura = input.nextDouble();
                    f = new Triangulo( base, altura );
                    f.mostrar();
                }

                default -> System.out.println("Opção indiponível!");
            }
            System.out.println();
        }while( true );
    }

}
