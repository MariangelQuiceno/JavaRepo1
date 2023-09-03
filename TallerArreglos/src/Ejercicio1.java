import java.io.IOException;
import javax.swing.JOptionPane;

//1. Haga un arreglo que permita almacenar el valor de 5 números enteros y obtenga la 
//sumatoria.




public class Ejercicio1 {
public static void main(String[] args) throws IOException {
		
	int numeros[] = new int[4];
	
	for (int i = 0; i < numeros.length; i++) {
	numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero para la posición: " + i));
	}
	
	String info = "Valores: \n";
	
	for (int i = 0; i < numeros.length; i++) {
		info += "numeros["+i+"] =" + numeros[i];
		info += "\n";
	}
		
	}
}
