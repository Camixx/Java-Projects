package ausgjhassd;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		System.out.println("hola");
		
		try {
			throw new IllegalArgumentException("Soy un error");

		}
		catch  (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			
		}
		
	}

}
