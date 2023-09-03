package Taller;
import javax.swing.JOptionPane;




public class InicioIMC {
	
	public static int inicio1() {
		
		int opcion1 = 0;
		

		String menu1 = "ingrese una Opción \n\n";
		menu1 += "1. Ingresar Datos \n";
		menu1 += "2. Visualizar datos + IMC \n";
		
		opcion1 = Integer.parseInt(JOptionPane.showInputDialog(menu1));

		   switch (opcion1) {
		       case 1:
		    	   
		    	String menuD = "ingrese una Opción para los Datos \n\n";
		   		menuD += "1. Datos Altura \n";
		   		menuD += "2. Datos Peso \n";
		    	int opcionDatos = Integer.parseInt(JOptionPane.showInputDialog(menuD));
		    	
		    	 switch (opcionDatos) {
		    	 	case 1:
		    	 		 EditorDatosIMC.guardarAltura();
		    	 	break;
		    	 	
		    	 	case 2:
		    	 		EditorDatosIMC.guardarPeso();
		    	 	break;
		    	 	
		    	 	default:
				           System.out.println("Opción no valida");
		    	 	
		    	 }
		           break;
		           
		       case 2:
		    	   IMC.calcularIMC(null, null);
		           break;
		       
		       default:
		           System.out.println("Opción no valida");
		   } 
		
		return inicio1();
		

		
		   } 
		   
		
		
		
	}


