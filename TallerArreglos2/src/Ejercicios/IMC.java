package Ejercicios;

import javax.swing.JOptionPane;

public class IMC {
public static void main(String[] args) {
	
	
	 int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos a Ingresar: "));
	 int contador = 0;
	 
	 double[] arregloPeso = new double [cantidad];
	 double[] arregloAltura = new double [cantidad];
	 
	 String verificador = "";
	 


		do {

			for (int i = 0; i < cantidad; i++) {
		        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los valores del peso del usuario " + (i + 1) + ":"));
		       
		     if ( peso <= 0 ) {
		        	JOptionPane.showMessageDialog(null, "No se permiten valores negativos");
		            i--;
		     }else{
		      arregloPeso[i] = peso; 
		     }
		     
		     for (int a = 0; a < cantidad; a++) {
			        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los valores de la altura del usuario " + (a + 1) + ":"));
				
			 if ( altura <= 0 ) {
			        	JOptionPane.showMessageDialog(null, "No se permiten valores negativos");
			            a--;
			 }else{
			   arregloAltura[a] = altura; 
			 }
			 
			 double[] imc = new double [cantidad];
			 
			 String info = System.out.println("\n Conclusiones:");
				
				
				
				for (int formula = 0; formula < cantidad; formula++) {
			         int operacion = (int) (arregloPeso[formula] / (arregloAltura[formula] * arregloAltura[formula])); 
			         imc[formula] = operacion;
			         
			         
			    if (operacion > 18 ) {
			    	System.out.println("\n Conclusiones:");
					System.out.println("Los datos de la Posición [" + i + "] es: " + "Altura: " + arregloAltura[a] +  "Peso: " + arregloPeso[i] + "IMC: " + imc[formula] + "Anorexia" + "\n");
			    }
			    
			    if (operacion >= 18 && operacion < 20) {
			    	System.out.println("\n Conclusiones:");
					System.out.println("Los datos de la Posición [" + i + "] es: " + "Altura: " + arregloAltura[a] +  "Peso: " + arregloPeso[i] + "IMC: " + imc[formula] + "Anorexia" + "\n");
			    }
			 
		        }	
		}
			
			if (contador < cantidad) {
				verificador = JOptionPane.showInputDialog("Desea reinici");	
			}else {
				JOptionPane.showMessageDialog(null, "Ya no hay más datos",
						"FIN",JOptionPane.WARNING_MESSAGE);
				verificador = "no";
			}
			
			
		         
		  
			
		} 
			} while (verificador.equalsIgnoreCase("si"));
		
}
}
		
