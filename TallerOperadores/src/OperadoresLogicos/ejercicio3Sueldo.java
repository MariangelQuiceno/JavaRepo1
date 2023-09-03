package OperadoresLogicos;
import java.io.IOException;
import javax.swing.JOptionPane;


//Algoritmo que calcule lo que gana un empleado con base a las horas trabajadas  
//teniendo en cuenta que cada hora se paga a 2000, adicionalmente se le realiza  
//unos descuentos con respecto a un impuesto de seguridad del 10% sobre su salario.





public class ejercicio3Sueldo {
public static void main(String[] args) throws IOException {
		
int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas de trabajo"));
double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sus Salario "));

int horasT = horas * 2000;
double descuento =  horasT + sueldo * 0.10 - sueldo;
System.out.println("Su paga total es: " + descuento);

}
}


