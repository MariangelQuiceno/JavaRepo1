package Ejercicios;
import javax.swing.JOptionPane;

public class EditorDatosIMC {
	
	public static double[] guardadorPeso() {
		
		
		
		int contador = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de datos \n\n"));
		
		double[] arregloPeso = new double [contador];
		
		for (int i = 0; i < contador; i++) {
	        double numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los datos del Peso"));
	        arregloPeso[i] = numero; 
	       
	        }
		
		
		String vef = JOptionPane.showInputDialog("Ingrese 'Salir' para Volver al Menu");
		
			if (vef.equalsIgnoreCase("salir")) {
			System.out.println("Los datos del Peso se registraron");
             
		}
			
			return arregloPeso;
}
	
	public static double[] guardadorAltura() {
		
		
		
		int contador = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de datos \n\n"));
		double[] arregloAltura = new double [contador];
		
		for (int i = 0; i < contador; i++) {
	        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los datos de la Altura"));
	        arregloAltura[i] = numero; 
	       
	        }
		
		
		String vef = JOptionPane.showInputDialog("Ingrese 'Salir' para Volver al Menu");
		
			if (vef.equalsIgnoreCase("salir")) {
			System.out.println("Los datos de Altura se registraron");
             
		}
			
			return arregloAltura;
}
	
	public static double visualizadorPeso(double[] arregloPeso) {
		
		System.out.println("Datos del Peso:");
		
		double[] datosP = new double[arregloPeso];
		
		for (int i = 0; i < arregloPeso.length; i++) {
            System.out.print("Los datos del peso de la Posición [" + i + "] son: " + arregloPeso[i] + "\n");
        }
		
		return visualizadorPeso
		
	}
	
public static double visualizadorAltura(double[] arregloAltura) {
		
		System.out.println("Datos de la Altura:");
		
		
		for (int i = 0; i < arregloAltura.length; i++) {
            System.out.print("Los datos de la Altura de la Posición [" + i + "] son: " + arregloAltura[i] + "\n");
        }
		
		return visualizadorAltura(arregloAltura);
		
	}
	
	
}



