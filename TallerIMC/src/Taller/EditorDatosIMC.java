package Taller;
import javax.swing.JOptionPane;

public class EditorDatosIMC {
	
    public static double[] guardarAltura() {
        int contador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de datos de Altura"));

        double[] arregloAltura = new double[contador];

        for (int i = 0; i < contador; i++) {
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura " + (i + 1)));
            arregloAltura[i] = altura;
        }

        return arregloAltura;
    }




public static double[] guardarPeso() {
	
    int contador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de datos de Peso"));

    double[] arregloPeso = new double[contador];

    for (int i = 0; i < contador; i++) {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Peso " + (i + 1)));
        arregloPeso[i] = peso;
    }

    return arregloPeso;
}
}






