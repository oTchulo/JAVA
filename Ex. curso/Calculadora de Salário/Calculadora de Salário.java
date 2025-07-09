package exercicicos;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int nmdfun;
			int htr;
			double vlrph;
			nmdfun = sc.nextInt();
			htr = sc.nextInt();
			vlrph = sc.nextDouble();
			double salario = htr * vlrph;
			System.out.printf("NUMBER ID = %d%n", nmdfun);
			System.out.printf("SALARY = U$ %.2f%n", salario);
		}
	}

}
