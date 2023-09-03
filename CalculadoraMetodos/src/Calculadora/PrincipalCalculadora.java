package Calculadora;
import javax.swing.JOptionPane;


public class PrincipalCalculadora {
	
	 public static void main(String[] args) {
		 
		 String opcion1 = "";
		 
	
			
		 String menu = "Bienvenido a la Calculadora \n";
		 
		 menu += "\n ¿Desea continuar? \n - ¿Si? \n - ¿No?";
		 
		 
		 
		 opcion1 =  JOptionPane.showInputDialog(menu);
		 
		 if (opcion1.equalsIgnoreCase("Si")) {
			 InicioCalculadora.inicio();
		} else if (opcion1.equalsIgnoreCase("No")) {
			System.out.println("Ha salido de la calculadora...");
		}
}
}


		 
		 
	   
		 
	
