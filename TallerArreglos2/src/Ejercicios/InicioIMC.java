package Ejercicios;
import javax.swing.JOptionPane;




public class InicioIMC {
	
	public static int inicio1() {
		
		int opcion1 = 0;
		

		String menu1 = "ingrese una Opci�n \n\n";
		menu1 += "1. Ingresar Datos \n";
		menu1 += "2. Visualizar datos \n";
		menu1 += "3. Calcular Datos \n";
		menu1 += "4. Resultados  \n ";
		
		opcion1 = Integer.parseInt(JOptionPane.showInputDialog(menu1));

		   switch (opcion1) {
		       case 1:
		    	   
		    	String menuD = "ingrese una Opci�n para los Datos \n\n";
		   		menuD += "1. Datos Altura \n";
		   		menuD += "2. Datos Peso \n";
		    	int opcionDatos = Integer.parseInt(JOptionPane.showInputDialog(menuD));
		    	
		    	 switch (opcionDatos) {
		    	 	case 1:
		    	 		 EditorDatosIMC.guardadorAltura();
		    	 	break;
		    	 	case 2:
		    	 		EditorDatosIMC.guardadorPeso();
		    	 	break;
		    	 	
		    	 	default:
				           System.out.println("Opci�n no valida");
		    	 	
		    	 }
		           break;
		           
		       case 2:
		    	   String menuV = "ingrese una Opci�n para los Datos \n\n";
			   		menuV += "1. Datos Altura \n";
			   		menuV += "2. Datos Peso \n";
			    	int opcionV = Integer.parseInt(JOptionPane.showInputDialog(menuV));
			    	
			    	 switch (opcionV) {
			    	 	case 1:
			    	 		 EditorDatosIMC.visualizadorAltura(null);
			    	 	break;
			    	 	case 2:
			    	 		EditorDatosIMC.visualizadorPeso(null);
			    	 	break;
			    	 	
			    	 	default:
					           System.out.println("Opci�n no valida");
			    	 	
			    	 }
		           break;
		       
		       default:
		           System.out.println("Opci�n no valida");
		   } 
		
		return inicio1();
		

		
		   } 
		   
		
		
		
	}


