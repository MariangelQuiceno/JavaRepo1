import javax.swing.JOptionPane;

//Crea un algoritmo que calcule e imprima el promedio de 3 notas parciales

public class ejercicio12Notas {
public static void main(String[] args) {
		
double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primera Nota"));
double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su segunda Nota"));
double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su tercera Nota"));

double suma = nota1 + nota2 + nota3;
double promedio = suma / 3;

System.out.println("El promedio de sus tres notas es: " + promedio);

}
}
