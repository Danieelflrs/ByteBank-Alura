package Excepciones;
public class Flujo {
	public static void main(String[] args) {
		System.out.println("Inicio del Main: ");
		metodo1();
		System.out.println("Fin del Main.");
	}
	private static void metodo1() {
		System.out.println("Inicio método 1: ");
		metodo2();
		System.out.println("Fin método 1.");
	}
	private static void metodo2() {
		System.out.println("Inicio método 2: ");
		for (int i = 1 ; i <= 5 ; i++) {
			System.out.println(i);
		}
		System.out.println("Fin método 2.");
	}
}
