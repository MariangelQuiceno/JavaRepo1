package ejerciciosExtras;

import java.io.IOException;

import javax.swing.JOptionPane;

public class menu {
	public static void main(String[] args) throws IOException {
		
		double n1 = 0, n2 = 0, resp;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer Numero"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo Numero"));
		
		String menu = "Menu Matematico\n\n";
		menu+= "¿Qué quiere hacer?\n";
		menu+= "1. Sumar\n";
		menu+= "2. Restar\n";
		menu+= "3. Multiplicar\n";
		menu+= "4. Dividir\n";
		menu+= "5. Cambiar Numeros\n";
		menu+= "6. Salir\n\n";
		menu+= "Ingrese una opción\n\n";
		
		int opc = 0;

		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opc) {
			
			case 1:
				System.out.println("Operacion: Suma");
				resp = n1 + n2;
				System.out.println("El resultado de la suma es: " + resp);
				break;
				
			case 2:
				System.out.println("Operacion: Restar");
				resp = n1 - n2;
				System.out.println("El resultado de la resta es: " + resp);
				break;
			
			case 3:
				System.out.println("Operacion: Multiplicar");
				resp = n1 * n2;
				System.out.println("El resultado de la multiplicacion es: " + resp);
				break;
				
			case 4:
				System.out.println("Operacion: Dividir");
				if(n2 > 0) {
					resp = n1 / n2;
					System.out.println("El resultado de la división es: " + resp);
				}else {
					JOptionPane.showMessageDialog(null, "No se puede realizar la división" + "entre 0"," Advertencia", JOptionPane.WARNING_MESSAGE);
				}
				break;
				
			case 5:
				System.out.println("Cambio de numeros: ");
				n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer Numero"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo Numero"));
				System.out.println("Los nuevos numeros son: " + n1 + " y " + n2);
				break;
			
			case 6:
				System.out.println("\n Ciao!");
				break;
			
			default:
				System.out.println("No existe la opción... ");
				break;
				
			}
		} while ( opc != 6 );
		System.out.println("Ha salido del programa...");
}
}