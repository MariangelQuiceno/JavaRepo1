import javax.swing.JOptionPane;

//13. Cree un algoritmo imprima el nombre, apellido, documento de identidad, edad y profesi�n de una persona de la siguiente manera: 

//Datos ingresados:
//Nombre completo: Pepito P�rez
//Documento: 10934566
//Edad= 21
//Profesi�n: Estudiante
//Bienvenido!!!



public class ejercicio13Usuario {
public static void main(String[] args) {
	
	String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
	String apellido = JOptionPane.showInputDialog("Ingrese su Apellido");
	String documento = JOptionPane.showInputDialog("Ingrese su documento");
	int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
	String profesion = JOptionPane.showInputDialog("Ingrese su Profesi�n");
	
	System.out.println("--------------Datos Ingresados--------------");
	System.out.println("Nombre completo: " + nombre);
	System.out.println("Documento: " + documento);
	System.out.println("Edad: " +  edad);
	System.out.println("Profesion: " + profesion);
	System.out.println("�Bienvenido!");
	
	
	

	}
}
