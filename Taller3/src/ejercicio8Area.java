import javax.swing.JOptionPane;

//Halle el �rea de un tri�ngulo rect�ngulo si su base y altura son de un valor desconocido (�rea=(base*altura)/2).

public class ejercicio8Area {
public static void main(String[] args) {
		
double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del tri�ngulo rect�ngulo"));
double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del tri�ngulo rect�ngulo"));
double area = base * altura;
double areaFinal = area / 2;

JOptionPane.showMessageDialog(null, "El area del tri�ngulo rect�ngulo es : " + areaFinal);
System.exit(0);


}
}
