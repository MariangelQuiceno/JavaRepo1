import javax.swing.JOptionPane;

//Halle el área de un triángulo rectángulo si su base y altura son de un valor desconocido (área=(base*altura)/2).

public class ejercicio8Area {
public static void main(String[] args) {
		
double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triángulo rectángulo"));
double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triángulo rectángulo"));
double area = base * altura;
double areaFinal = area / 2;

JOptionPane.showMessageDialog(null, "El area del triángulo rectángulo es : " + areaFinal);
System.exit(0);


}
}
