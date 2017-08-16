import java.util.Scanner;

public class Tutorial {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		// Definición de variables
		sc = new Scanner(System.in);
		String nombre;
		int edad;
		
		// Entrada de datos
		System.out.println("Ingrese su nombre");
		nombre = sc.nextLine();
		
		System.out.println("Ingrese su edad");
		edad = sc.nextInt();
		
		
		
		//Salida de datos
		
		// Forma 1
		System.out.printf("Hola %s su edad es %d", nombre, edad);
		
		// Forma 2
		System.out.println("Hola " + nombre );
	}

}
