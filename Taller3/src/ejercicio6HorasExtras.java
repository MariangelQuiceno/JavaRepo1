import javax.swing.JOptionPane;

//Cree un algoritmo que reciba como entrada el sueldo de una persona y sus horas extras 
//trabajadas y luego imprima el Sueldo total de esta persona dado que cada hora extra vale $3000.


public class ejercicio6HorasExtras {
public static void main(String[] args) {
		
double sueldoObrero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
double horasExtras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus Horas Extras"));
int horasExtrasPagas = (int) horasExtras * 3000;
double valorFinal = (double) sueldoObrero + horasExtrasPagas;
JOptionPane.showMessageDialog(null, "Su salario total, con las horas extras pagadas es:  " + valorFinal);
System.exit(0);

		 
}
}


