import javax.swing.JOptionPane;

//13. Cree un algoritmo imprima el nombre, apellido, documento de identidad, edad y profesión de una persona de la siguiente manera: 

//Datos ingresados:
//Nombre completo: Pepito Pérez
//Documento: 10934566
//Edad= 21
//Profesión: Estudiante
//Bienvenido!!!



public class ejercicio13Usuario {
public static void main(String[] args) {
	
	String nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
	String apellido = JOptionPane.showInputDialog("Ingrese su Apellido");
	String documento = JOptionPane.showInputDialog("Ingrese su documento");
	int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
	String profesion = JOptionPane.showInputDialog("Ingrese su Profesión");
	
	System.out.println("--------------Datos Ingresados--------------");
	System.out.println("Nombre completo: " + nombre);
	System.out.println("Documento: " + documento);
	System.out.println("Edad: " +  edad);
	System.out.println("Profesion: " + profesion);
	System.out.println("¡Bienvenido!");
	
	
	

	}
}
