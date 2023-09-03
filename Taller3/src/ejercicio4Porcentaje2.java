import javax.swing.JOptionPane;

//Modificar el algoritmo anterior para que muestre el 15% de un valor ingresado por el usuario.

public class ejercicio4Porcentaje2 {
	public static void main (String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un Valor"));
		double valorFinal = valor * 0.15;
		
		JOptionPane.showMessageDialog(null, "El 15% del valor es: " + valorFinal);
		System.exit(0);
		
		
		
		
	}

}
