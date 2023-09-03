package Taller;

import javax.swing.JOptionPane;


public class PrincipalIMC {
	public static void main(String[] args) {
		
		String opcion1 = "";
		 
		
		
		 String menu1 = "Bienvenido a la Calculadora de IMC \n";
		 
		 menu1 += "\n ¿Desea continuar?";
		 
		 
		 
		 opcion1 =  JOptionPane.showInputDialog(menu1);
		 
		 if (opcion1.equalsIgnoreCase("Si")) {
			 InicioIMC.inicio1();
		} else if (opcion1.equalsIgnoreCase("No")) {
			System.out.println("Ha salido de la calculadora...");
		}

}
}