import java.io.*;



//Calcular el 15% de un valor constante.

public class ejercicio1Porciento {
	public static void main(String[] args) throws IOException {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		final double valor = 100;
		double porcentaje = valor * 0.15;
		System.out.println("El 15% del numero es: " + porcentaje);
		
		
}
}