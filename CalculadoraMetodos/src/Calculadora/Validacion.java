package Calculadora;

import javax.swing.JOptionPane;


public class Validacion {
	
	public static int validarNegativosA(int a) {
		
		do {
			
		a =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer número"));
		
		if (a < 0) {
		System.out.println("No puede ser datos negativos");
		}
		
		}while (a < 0);
		
		return a;	
}
	
	public static int validarNegativosB(int b) {
		
		do {
			
		b =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo  número"));
		
		if (b < 0) {
		System.out.println("No puede ser datos negativos");
		}
		
		}while (b < 0);
		
		return b;
}
	
	public static int validarDivisión(int b) {
		
		do {
			
		b =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo  número"));
		
		if (b == 0 && b < 0) {
		System.out.println("No puede ser un numero negativo");
		}
		
		}while (b == 0 || b < 0);
		
		return b;
}

}

