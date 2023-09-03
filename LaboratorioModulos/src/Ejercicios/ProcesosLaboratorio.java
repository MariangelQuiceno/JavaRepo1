package Ejercicios;
import javax.swing.JOptionPane;

public class ProcesosLaboratorio {
	

		
		// Definimos las variables que vamos a usar
		int anio, dia, mes;
		int anioActual, mesActual, diaActual;
		/**
		* Inicia la ejecuci�n del programa. Solicita la cantidad de veces que se
		* desea realizar la operaci�n y llama a los m�todos correspondientes para
		* solicitar informaci�n y calcular la edad.
		*/
		public void iniciar() {
		// Pedimos la cantidad de veces que el usuario quiere ejecutar el programa
		int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces"));
		// Usamos un ciclo for para repetir el proceso de solicitar los datos y calcular la edad la cantidad de veces que indic� el usuario
		for (int i = 0; i < cant; i++) {
		solicitarDatos();
		calcularEdad();
		}
		}
		
		
		/**
		* Solicita la fecha de nacimiento de la persona y calcula su edad.
		*/
		public void solicitarDatos() {
		// Definimos la fecha actual en variables para poder calcular la edad
		anioActual = 2023;
		mesActual = 3;
		diaActual = 7;
		// Pedimos al usuario el a�o, mes y d�a de su fecha de nacimiento
		int anioNacimiento = validarNegativos("Ingrese el a�o de nacimiento");
		int mesNacimiento = validarMeses();
		int diaNacimiento = validarDias();
		// Calculamos la edad restando la fecha de nacimiento a la fecha actual
		anio = anioActual - anioNacimiento;
		mes = mesActual - mesNacimiento;
		dia = diaActual - diaNacimiento;
		}
		
		
		/**
		* Solicita el mes de nacimiento de la persona y valida que sea un valor
		* v�lido (entre 1 y 12).
		* @return El mes de nacimiento validado.
		*/
		public int validarMeses() {
		int mes = 0;
		// Usamos un ciclo do-while para pedirle al usuario el mes hasta que ingrese un valor v�lido
		do {
		mes = validarNegativos("Ingrese el Mes de nacimiento");
		if (mes == 0 || mes > 12) {
		System.out.println("Mes Incorrecto");
		}
		} while (mes == 0 || mes > 12);
		return mes;
		}
		
		/**
		* Solicita el d�a de nacimiento de la persona y valida que sea un valor
		* v�lido (entre 1 y 31).
		* @return El d�a de nacimiento validado.
		*/
		
		public int validarDias() {
		int dia = 0;
		// Usamos un ciclo do-while para pedirle al usuario el d�a hasta que ingrese un valor v�lido
		do {
		dia = validarNegativos("Ingrese el Dia de nacimiento");
		if (dia == 0 || dia > 31) {
		System.out.println("Dia Incorrecto");
		}
		} while (dia == 0 || dia > 31);
		return dia;
		}
		
		
		
		public void calcularEdad() {
			if (anio > 18) {
			System.out.println("Usted es mayor de edad");
			} else if (anio == 18 && mes > 0) {
			System.out.println("Usted es mayor de edad");
			} else if (anio == 18 && mes == 0 && dia >= 0) {
			System.out.println("Usted es mayor de edad");
			} else {
			System.out.println("Usted es menor de edad");
			}
			}
		
		
		
			/**
			* M�todo que solicita un n�mero al usuario a trav�s de una ventana de di�logo de entrada y
			* verifica que el n�mero ingresado no sea negativo.
			*
			* @param mensaje mensaje que se mostrar� al usuario en la ventana de di�logo de entrada.
			* @return el n�mero ingresado por el usuario sin ser negativo.
			*/
			public int validarNegativos(String mensaje) {
			int dato;
			// Usamos un ciclo do-while para pedirle al usuario el dato hasta que ingrese un valor v�lido
			do {
			dato=Integer.parseInt(JOptionPane.
			showInputDialog(mensaje));
			if (dato<0) {
			System.out.println("No puede ser datos negativos");
			}
			} while (dato<0);
			return dato;
			}
			
			
			
			
}



