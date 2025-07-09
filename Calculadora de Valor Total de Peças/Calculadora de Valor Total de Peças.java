package exercicicos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			
			int code;
			int number;
			double value;
			
			int code2;
			int number2;
			double value2;
			
			code = sc.nextInt();
			number = sc.nextInt();
			value = sc.nextDouble();
			
			code2 = sc.nextInt();
			number2 = sc.nextInt();
			value2 = sc.nextDouble();
			
			double pecas1t = number * value;
			double pecas2t = number2 * value2;
			double vtp = pecas1t + pecas2t;
			
			System.out.printf("Valor a pagar: R$ %.2f%n ", vtp);
		}
	}

}
