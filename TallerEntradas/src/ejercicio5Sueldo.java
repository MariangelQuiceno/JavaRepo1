import javax.swing.JOptionPane;

public class ejercicio5Sueldo {

public static void main(String[] args) {


int sueldo = 0; 


String sueldoN = JOptionPane.showInputDialog("Ingrese su sueldo");
sueldo = Integer.parseInt(sueldoN);

double valorAumentado = sueldo * 0.3;
double valorFinal = valorAumentado + sueldo;

JOptionPane.showMessageDialog(null, "El resultado es: " + valorFinal);
System.exit(0);
 
}
}