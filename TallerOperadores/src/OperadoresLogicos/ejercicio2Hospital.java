package OperadoresLogicos;
import java.io.IOException;
import javax.swing.JOptionPane;

//Cree un algoritmo que calcule e imprima lo que debe pagar un paciente a un hospital 
//debido a un tratamiento teniendo como entradas el costo del tratamiento, 
//el número de días de hospitalización y el costo de los medicamentos. 
//Cada día de hospitalización cuesta $100000.

//Tenga en cuenta qué si el paciente es subsidiado se le realizará 
//un descuento del 10% sobre el valor total del valor a pagar.
//
//Sino, por motivos de cumpleaños de la empresa, tan solo se descontará el 5%;

public class ejercicio2Hospital {

	public static void main(String[] args) throws IOException {
	
	int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias de Hospitalizacion"));
	double tratamiento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del Tratamiento"));
	double medicamentos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo Total de los medicamentoos"));
		
	String subsidiado = JOptionPane.showInputDialog("¿Usted es Subsidiado? (si o no)");
	String cumpleaños = JOptionPane.showInputDialog("¿Usted esta Cumpliendo Años? (si o no)");
		
		
	int diasCosto = dias * 100;
	double costoTotal = diasCosto + tratamiento + medicamentos;


		 if (subsidiado.equals("si") && cumpleaños.equals("no")) {
			 double costoTotal1= costoTotal - costoTotal * 0.10 ;
				System.out.println("El costo final es: " + costoTotal1);
				
	        } else if (subsidiado.equals("no") && cumpleaños.equals("si")) {
	        	double costoTotal2 = costoTotal - costoTotal * 0.05;
				System.out.println("El costo final es: " + costoTotal2);
				
	        } else if (subsidiado.equals("si") && cumpleaños.equals("si")) {
	        	double costoTotal3 = costoTotal - costoTotal * 0.15 ;
				System.out.println("El costo final es: " + costoTotal3);
				
	        } else {
	            System.out.println("El costo final es: " + costoTotal);
}
}
		
}
