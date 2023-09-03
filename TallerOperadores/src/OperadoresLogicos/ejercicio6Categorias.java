
package OperadoresLogicos;
import java.io.IOException;
import javax.swing.JOptionPane;

//Modifique el algoritmo anterior para calcular el 
//nuevo salario de un obrero basándose en la siguiente tabla
//
//A = 30%
//B = 20%
//C = 10%

public class ejercicio6Categorias {
public static void main(String[] args) throws IOException {
	
	double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sus Salario "));
	String pregunta = JOptionPane.showInputDialog("¿A que categoria pertenece? (Categorias: A, B o C)");
	double aumentoA =  sueldo * 0.3 + sueldo;
	double aumentoB =  sueldo * 0.2 + sueldo;
	double aumentoC =  sueldo * 0.1 + sueldo;
	
	switch (pregunta) {
	case "A":
		System.out.println("Su nuevo salario con el 30% de aumento es: " + aumentoA);
		break;
	case "B":
		System.out.println("Su nuevo salario con el 20% de aumento es: " + aumentoB);
		break;
	case "C":
		System.out.println("Su nuevo salario con el 10% de aumento es: " + aumentoC);
		break;
	default:
		System.out.println("Inserte una categoria valida... ");
		break;
	
	}
}

}
