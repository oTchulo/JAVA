package exercicicos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			
			double A;
			double B;
			double C;
			A = sc.nextDouble();
			B = sc.nextDouble();
			C = sc.nextDouble();
			
			double at = (A * C) / 2;
			System.out.printf("Triângulo = %.3f%n", at);
				
			double ac  = 3.14159 * C * C;
		    System.out.printf("Circulo = %.3f%n", ac);
		    
		    double atp = (A + B) * C / 2;
		    System.out.printf("Trapézio = %.3f%n", atp);
		    
		    double aqd = B * B;
		    System.out.printf("Quadrado = %.3f%n", aqd);
		    
		    double aret = A * B;
		    System.out.printf("Retângulo = %.3f%n", aret);
			sc.close();
		}
	}

}
