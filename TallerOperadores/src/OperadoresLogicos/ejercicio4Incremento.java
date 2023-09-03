package OperadoresLogicos;
import java.io.IOException;
import javax.swing.JOptionPane;


//Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario anterior.




public class ejercicio4Incremento {
public static void main(String[] args) throws IOException {

	double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sus Salario "));
	String pregunta = JOptionPane.showInputDialog("¿Usted recibio un incremento del 25%? (si o no)");
	double aumento =  sueldo * 0.25 + sueldo;
	
	if(pregunta == "si" ) {
		System.out.println("Su salario con un incremento del 25% es: " + aumento);
	}else {
		System.out.println("Su salario sigue igual: " + sueldo);
	}
}
}
