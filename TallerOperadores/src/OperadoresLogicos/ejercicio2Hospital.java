package OperadoresLogicos;
import java.io.IOException;
import javax.swing.JOptionPane;

//Cree un algoritmo que calcule e imprima lo que debe pagar un paciente a un hospital 
//debido a un tratamiento teniendo como entradas el costo del tratamiento, 
//el n�mero de d�as de hospitalizaci�n y el costo de los medicamentos. 
//Cada d�a de hospitalizaci�n cuesta $100000.

//Tenga en cuenta qu� si el paciente es subsidiado se le realizar� 
//un descuento del 10% sobre el valor total del valor a pagar.
//
//Sino, por motivos de cumplea�os de la empresa, tan solo se descontar� el 5%;

public class ejercicio2Hospital {

	public static void main(String[] args) throws IOException {
	
	int dias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los dias de Hospitalizacion"));
	double tratamiento = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del Tratamiento"));
	double medicamentos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo Total de los medicamentoos"));
		
	String subsidiado = JOptionPane.showInputDialog("�Usted es Subsidiado? (si o no)");
	String cumplea�os = JOptionPane.showInputDialog("�Usted esta Cumpliendo A�os? (si o no)");
		
		
	int diasCosto = dias * 100;
	double costoTotal = diasCosto + tratamiento + medicamentos;


		 if (subsidiado.equals("si") && cumplea�os.equals("no")) {
			 double costoTotal1= costoTotal - costoTotal * 0.10 ;
				System.out.println("El costo final es: " + costoTotal1);
				
	        } else if (subsidiado.equals("no") && cumplea�os.equals("si")) {
	        	double costoTotal2 = costoTotal - costoTotal * 0.05;
				System.out.println("El costo final es: " + costoTotal2);
				
	        } else if (subsidiado.equals("si") && cumplea�os.equals("si")) {
	        	double costoTotal3 = costoTotal - costoTotal * 0.15 ;
				System.out.println("El costo final es: " + costoTotal3);
				
	        } else {
	            System.out.println("El costo final es: " + costoTotal);
}
}
		
}
