import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite a base: ");
        double base=scan.nextDouble();
        System.out.println("digite a altura");
        double altura = scan.nextDouble();
        double ResultadoR = CalculandoAreas.areaRetangulo(base, altura);
        final double PI =3.14;
     //   System.out.println("Digite o raio: ");
    //    double r = scan.nextDouble();
        double ResultadoC = CalculandoAreas.areaCirculo(PI,10);

     System.out.println("area do retangulo: " + ResultadoR);
     System.out.println("area do circulo: " + ResultadoC);

    }

    }

