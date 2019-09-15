package co.edu.uan.CalculoTest;

public class Test {

	public static void main(String[] args) {
		double resultado;
		resultado = Calculo.suma(4, 5);
		System.out.println("Resultado suma:" + resultado);
		resultado = Calculo.resta(4, 5);
		System.out.println("Resultado resta:" + resultado);
		resultado = Calculo.multiplicacion(4, 5);
		System.out.println("Resultado multiplicacion:" + resultado);
		resultado = Calculo.division(0, 5);
		System.out.println("Resultado division:" + resultado);
		resultado = Calculo.potencia(-8, 5);
		System.out.println("Resultado potencia:" + resultado);
		resultado = Calculo.raiz(0);
		System.out.println("Resultado raiz:" + resultado);
	}

}
