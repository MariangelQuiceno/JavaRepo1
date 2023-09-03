import javax.swing.JOptionPane;

public class Principal {

	/*
	 * Haga un algoritmo que solicite el numero de horas 
	 * trabajadas de un empleado, teniendo que el valor de 
	 * la hora es igual a $2000 calcule el salario base y 
	 * realicele un descuento del 10% por concepto de 
	 * derechos medicos.
	 * 
	 * Almacene en arreglos los datos de los trabajadores
	 * (Nombre,salarioFinal)
	 * 
	 */
	
	
	public static void main(String[] args) {
		int numHoras=0;
		double salarioBase,salarioTotal;
		final double VAL_HORA=2000;
		String nombre;
		
		String nombres[]=new String[4];
		double salarios[]=new double[nombres.length];
		
		int cont=0;
		String resp="";
		do {

			nombre=JOptionPane.showInputDialog("Ingrese el nombre del empleado");
			nombres[cont]=nombre;
			
			
			////
			do {
				numHoras=Integer.parseInt(JOptionPane.
						showInputDialog("Ingrese las horas trabajadas"));
				if (numHoras<=0) {
					JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
				}
				
			} while (numHoras<=0);
		
				salarioBase=numHoras*VAL_HORA;
				
				salarioTotal=salarioBase-(salarioBase*0.1);
				salarios[cont]=salarioTotal;
				
				System.out.println("Para el empleado: "+nombre);
				System.out.println(""
						+ "El salario base es: "+salarioBase+" "
								+ "\nel salario total es: "+salarioTotal);

			////
				
			cont++;
			
			if (cont<nombres.length) {
				resp=JOptionPane.showInputDialog("Ingrese si para continuar");	
			}else {
				JOptionPane.showMessageDialog(null, "Ya no hay empleados",
						"FIN",JOptionPane.WARNING_MESSAGE);
				resp="no";
			}
			
		} while (resp.equalsIgnoreCase("si"));

		System.out.println("\n<<<<<<<<<<<<<<<DATOS EMPLEADOS>>>>>>>>>>>>>>>");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]+", Salario="+salarios[i]);
		}
		
		
	}

}