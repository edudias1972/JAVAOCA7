package writwjava;

import java.util.Scanner;

// Calcula dois números 

public class doisNumerosCalcula {

	public static void main(String[] args) {
		// Input entrada dos dados 
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int x = scanner.nextInt();

		System.out.println("Digite o segundo número: ");
		int y = scanner.nextInt();
		
		//  Processsamento Calculando 

		int soma = x + y;
		                                                          // saida
		System.out.println("O resultado da soma de é:  x + y =  " + soma);
		
		int subtrai = x - y ;
		                                                          
		System.out.println("O resultado da sutração de  é: x - y =  " + subtrai);
		
		int multiplica = x * y ;
		
		System.out.println("O resultado da multiplicação de é:  x  * y =  " + multiplica);
		
		int divisao = x / y ;
		
		System.out.println("O resultado da divisão de é:  x  / y = " + divisao);
				
		
		scanner.close();
	}

}
