package writwjava;

public class MySweetProgram {

	public static void main(String[] args) {
		// Criação do objeto User
		User user = new User();
		user.firstName = "Eduardo";
		user.lastName = "Dias";
		System.out.println(user.getFullName());
	}

}