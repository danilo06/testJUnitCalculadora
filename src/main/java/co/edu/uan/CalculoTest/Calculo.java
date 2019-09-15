package co.edu.uan.CalculoTest;

/**
 * Hello world!
 *
 */
public class Calculo {

	public static double suma(double a, double b) {
		return a + b;
	}

	public static double resta(double a, double b) {
		return a - b;
	}

	public static double multiplicacion(double a, double b) {
		return a * b;
	}

	// Se deja en entero con el objetivo de causar ArithmeticException.
	public static int division(int a, int b) {
		return a / b;
	}

	public static double potencia(double a, double b) {
		return Math.pow(a, b);
	}

	public static double raiz(double a) {
		return Math.sqrt(a);
	}
}
