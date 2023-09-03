package ejerciciosExtras;
import javax.swing.JOptionPane;

public class extraSueldoAumento {
public static void main(String[] args) {

String nombre;
double sueldoActual, sueldoNuevo;
nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
sueldoActual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo Actual"));

if (sueldoActual >= 120000 && sueldoActual <= 1800000  ) {
	sueldoNuevo = sueldoActual + (sueldoActual*0.08);
	JOptionPane.showMessageDialog(null, "El resultado es: " + sueldoNuevo);
	System.exit(0);
}else {
	sueldoNuevo = sueldoActual + (sueldoActual*0.1);
}
System.out.println("Su sueldo no esta entre el Rango requerido ");

}
}

//Valide que el sueldo no sea inferior a 120.000 ni superior a 1.800.000