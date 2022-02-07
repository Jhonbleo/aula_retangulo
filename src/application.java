import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;


public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo x;
		x = new Retangulo();
		
		System.out.println("Digite a altura do retangulo: ");
		x.retA = sc.nextDouble();
		
		
		System.out.println("Digite a larguda do retangulo: ");
		x.retL = sc.nextDouble();
		
		double areaX = x.area();
		double perimetroX = x.perimetro();
		
		System.out.printf("A altura do retangulo: %s e a largura do retangulo: %s ",x.retA, x.retL);
		System.out.println();
		System.out.printf("A area do retangulo: %s " ,areaX);
		System.out.println();
		System.out.printf("O perimetro do retangulo: %s" ,perimetroX);
		System.out.println();
		
	sc.close();
	}
}
