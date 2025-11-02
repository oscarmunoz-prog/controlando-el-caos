import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan_l = new Scanner(System.in);
		Scanner scan_n = new Scanner(System.in);
		String operacion;
		int numero1, numero2;
		double resultado;

		System.out.println("Operaciones disponibles:");
		System.out.println("suma \"+\"");
		System.out.println("resta \"-\"");
		System.out.println("multiplicar \"*\"");
		System.out.println("suma \"/\"");
		System.out.println("salir \"exit\"");

		System.out.println("Que operacion quieres?");
		operacion = scan_l.nextLine();

		if (!operacion.equals("Exit")) {
			System.out.println("Que numeros quieres?");
			numero1 = scan_n.nextInt();
			numero2 = scan_l.nextInt();

			if (operacion.equals("+")) {
				resultado = numero1 + numero2;
				System.out.println("El resultado de la suma es: " + resultado);
			} else if (operacion.equals("-")) {
				resultado = numero1 - numero2;
				System.out.println("El resultado de la resta es: " + resultado);
			} else if (operacion.equals("*")) {
				resultado = numero1 * numero2;
				System.out.println("El resultado de la multiplicacion es: " + resultado);
			} else if (operacion.equals("/")) {
				resultado = numero1 / numero2;
				System.out.println("El resultado de la division es: " + resultado);
			}
		} else {
			System.out.println("Saliendo...");
		}

	}

}
