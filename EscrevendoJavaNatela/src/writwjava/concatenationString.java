package writwjava;

public class concatenationString {

	public static void main(String[] args) {
		// TODO Auto-generated  method stub
		
		String x = "Hello cats  ";
		// concatenando valor + valor 
		System.out.println(x + "and dogs ");
		
		// troca o valor da concatenação 
		x += " and puppies ";
		System.out.println(x);
		
		String name =  "Eduardo" ;
		System.out.println(String.format("helo Mister %s  ", name));
		
		// Contando quantas letras tem no nome.length()
		
		System.out.println(name.length());
	}

}
