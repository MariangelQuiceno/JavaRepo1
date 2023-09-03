package OperadoresLogicos;
import java.io.IOException;
import javax.swing.JOptionPane;


//Dadas tres notas de un estudiante, calcular la definitiva por promedio 
//aritmético y un mensaje que indique si gano o perdió el curso. La nota mínima necesaria para aprobar es 3.0.





public class ejercicio10Notas {
public static void main(String[] args) throws IOException {
		

double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primera Nota"));
double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su segunda Nota"));
double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su tercera Nota"));

double suma = nota1 + nota2 + nota3;
double promedio = suma / 3;

if(promedio > 3.0) {
	System.out.println("¡Felicidades, ha aprobado la materia! :D ");
}else {
	System.out.println("Oh no, no ha aprobado la materia... D: ");
}
}
}