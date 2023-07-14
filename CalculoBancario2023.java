package jurosetarifa;

import java.util.Scanner;

public class CalculoBancario2023 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor principal");
		double principal = scanner.nextDouble();
		
		System.out.println("Digite a taxa de juros(em decimal):");
		double taxaJuros = scanner.nextDouble();
		
		System.out.println( "Digite o numero de periodos:");
		int numPeriodo =
		scanner.nextInt();
		
		double juros = principal*taxaJuros*numPeriodo;
		double montante = principal+juros;
		
		System.out.println("o valor dos juros é:"+ juros);
		System.out.println("o montante total é:"+ montante);
		
		scanner.close();
		
		
		
	}

}
