package Calculadora;

import javax.swing.JOptionPane;

public class InicioCalculadora {
	
	public static int inicio() {
		
		int opcion = 0;
			
		int a = 0;
		int b = 0;

		String menu = "ingrese un numero para su Operación \n\n";
		menu += "1. Suma \n";
		menu += "2. Resta \n";
		menu += "3. Multiplicación \n";
		menu += "4. Dividir  \n ";

		opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

		   switch (opcion) {
		       case 1:
		        	int sumaResultado = Operaciones.sumar();
		           System.out.println("El resultado es: " + sumaResultado);
		           break;
		       case 2:
		    	   a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer numero"));
		    	   b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo numero"));
		        	int restaResultado = Operaciones.restar(a, b);
		           System.out.println("El resultado es: " + restaResultado);
		           break;
		       case 3:
		        	Operaciones.multiplicar();		           
		           break;
		       case 4:
		    	    a = Validacion.validarNegativosA(a);
		    	    b = Validacion.validarDivisión(b);
		        	Operaciones.dividir(a, b);
		           break;
		       default:
		           System.out.println("Opción no valida");
		   } 
		   
		
		
		return inicio();
        
    }
	
	

}

