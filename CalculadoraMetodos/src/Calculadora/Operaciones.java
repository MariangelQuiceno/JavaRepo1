package Calculadora;

import javax.swing.JOptionPane;

public class Operaciones {
	
	
	public static int sumar() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int resultado = a + b;
        return resultado;
    }

	public static int restar(int a, int b) {
        int resultado = a - b;
        return resultado;
    }
	
	public static void multiplicar() {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        int resultado = a * b;
        System.out.print("El resultado es: " + resultado );   
    }
	
	public static void dividir(int a, int b) {
        int resultado = a / b;
		System.out.print("\nEl resultado es: " + resultado ); 
}
	
    		
}

    


