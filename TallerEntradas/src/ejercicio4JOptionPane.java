import javax.swing.JOptionPane;

public class ejercicio4JOptionPane {

public static void main (String[] args) {


int valorA = 0; 
int valorB = 0;

String inputA = JOptionPane.showInputDialog("Ingrese un valor para A");
valorA = Integer.parseInt(inputA);

String inputB = JOptionPane.showInputDialog("Ingrese un valor para B");
valorB = Integer.parseInt(inputB);

int suma = valorA + valorB;

JOptionPane.showMessageDialog(null, "El resultado es: " + suma);
System.exit(0);
 
}
}