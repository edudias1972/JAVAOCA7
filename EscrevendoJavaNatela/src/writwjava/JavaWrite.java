package writwjava;           // package

import java.util.Scanner;         // import  

public class JavaWrite {        // classes 

	public static void main(String[] args) {       // principal main 
		// TODO Auto-generated method stub
		System.out.println("What is your name?");        // imprimindo
        
		// Escrevendo e lendo a reposta na tela do usuário 
		// type indentier = new type();		
		Scanner scanner = new Scanner(System.in);                // medoto para ler scanner
		String name = scanner.nextLine();                        // tipando 
		 
		System.out.println("Hello" + " " +  name  + "!");        // imprimindo o resultado  
	}

}
