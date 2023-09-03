package Taller;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	public static void main(String[] args) {
		double altura, peso, indiceMasaCorporal;
		String nombre;

		String nombres[] = new String[4];
		double alturas[] = new double[nombres.length];
		double pesos[] = new double[nombres.length];

		int cont = 0;
		String resp = "";
		do {

			nombre = JOptionPane.showInputDialog("Ingrese el nombre");
			nombres[cont] = nombre;

			do {
				altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"));
				alturas[cont] = altura;

				if (altura <= 0) {
					JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
				}

			} while (altura <= 0);

			do {
				peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso"));
				pesos[cont] = peso;

				if (altura <= 0) {
					JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
				}

			} while (peso <= 0);

			indiceMasaCorporal = peso / (altura * altura);

			if (indiceMasaCorporal < 18) {
				System.out.println("Su peso esta en el rango de Anorexia");
			}else if (indiceMasaCorporal >= 18 || indiceMasaCorporal < 18) {
				System.out.println("Su peso esta en el rango de Delgadez");
			}else if (indiceMasaCorporal >= 20 || indiceMasaCorporal < 27) {
				System.out.println("Su peso esta en el rango de Normalidad");
			}else if (indiceMasaCorporal >= 27 || indiceMasaCorporal < 30) {
				System.out.println("Su peso esta en el rango de Obesidad (grado1)");
			}else if (indiceMasaCorporal >= 35 || indiceMasaCorporal < 40) {
				System.out.println("Su peso esta en el rango de Obesidad (grado2)");
			}else if (indiceMasaCorporal >= 40 || indiceMasaCorporal < 50) {
				System.out.println("Su peso esta en el rango de Obesidad (grado3)");
			}else if (indiceMasaCorporal >= 50) {
				System.out.println("Su peso esta en el rango de Obesidad Mórbida");
			}
			

			cont++;

			if (cont < nombres.length) {
				resp = JOptionPane.showInputDialog("Ingrese si para continuar");
			} else {
				JOptionPane.showMessageDialog(null, "Ya no hay personas", "FIN", JOptionPane.WARNING_MESSAGE);
				resp = "no";
			}
		} while (resp.equalsIgnoreCase("si"));

		System.out.println("\n<<<<<<<<<<<<<<<DATOS DE USUARIOS>>>>>>>>>>>>>>>");

		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + ", altura=" + alturas[i] + ", peso=" + pesos[i]);
		}
	}
}