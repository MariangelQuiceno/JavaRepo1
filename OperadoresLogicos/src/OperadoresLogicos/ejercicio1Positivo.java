package OperadoresLogicos;
import javax.swing.JOptionPane;




//1. Algoritmo que ingrese un número y si es negativo 
//lo convierta a positivo y lo imprima, de lo contrario lo imprime normalmente.



public class ejercicio1Positivo {
public static void main(String[] args) {
	
	double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo Actual"));
	
	if(numero < 0) {
		numero = numero * -1;
		System.out.println("El numero ha sido convertido a positivo: " + numero);
	}else {
		System.out.println("El numero ya es positivo: ");
	}
	
}
}