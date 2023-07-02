package writwjava;

import java.util.Scanner;

public class LendoUmValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String fullAd = "yummmmm... my oh my chiken pot pie";
		  // PASSWORD 
		  String password = "let me in";
		  System.out.println("Guess the passord: ");
		  // input  entrada 
		  Scanner scanner = new Scanner(System.in);
		  String guess = scanner.nextLine();
		  System.out.println(password.equals(guess)); // true 
	}

}
