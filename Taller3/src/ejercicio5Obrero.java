import javax.swing.JOptionPane;

//Calcular el nuevo salario de un obrero si obtuvo un incremento del 25% sobre su salario anterior.

public class ejercicio5Obrero {
public static void main(String[] args) {
	

double sueldoN = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
double valorAumentado = sueldoN * 0.25;
double valorFinal = valorAumentado + sueldoN;
JOptionPane.showMessageDialog(null, "El resultado es: " + valorFinal);
System.exit(0);
 
}
}




