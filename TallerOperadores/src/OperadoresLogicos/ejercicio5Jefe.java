package OperadoresLogicos;

import javax.swing.JOptionPane;

//Modifique el algoritmo anterior para calcular el nuevo salario del obrero basado en un incremento que determina el jefe inmediato.

public class ejercicio5Jefe {
	public static void main(String[] args) {
		

		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sus Salario "));
		int incremento = Integer.parseInt(JOptionPane.showInputDialog("¿De cuanto es el incremento? (Inserte un valor entero)"));
		
		double modificacion = incremento / 100;
		double aumento =  sueldo * modificacion + sueldo;
		
		System.out.println("El sueldo con un incremento de " + incremento + "%" + " es: " + aumento);
		
		
		
		
}
}

