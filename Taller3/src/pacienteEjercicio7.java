import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.InputStreamReader;

//Cree un algoritmo que calcule e imprima lo que debe 
//pagar un paciente a un hospital debido a un tratamiento teniendo como entradas el 
//costo del tratamiento, el número de días de hospitalización y el costo de los medicamentos. 
//Cada día de hospitalización cuesta $100000.

public class pacienteEjercicio7 {

	public static void main(String[] args) throws IOException {
		JOptionPane.showMessageDialog(null, "Calculo de Factura");
		double valorTotal,costoTratamiento,costMedica,valTotalDias;
		int numDiasHospital;
		final int COSTO_DIA=100000;
		String nombre, mensaje;
		
		nombre=JOptionPane.showInputDialog("Ingrese el nombre del paciente");
		
		costoTratamiento=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del tratamiento"));
		numDiasHospital=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dias"));
		costMedica=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo del medicamento"));
		valTotalDias=numDiasHospital*COSTO_DIA;
		
		valorTotal=costoTratamiento+costMedica+valTotalDias;
		
		mensaje="<<<<<<<<<<<<< FACTURA >>>>>>>>>>>>>\n";
		mensaje=mensaje+"Nombre: "+nombre.toUpperCase()+", Costo Tratamiento: "+costoTratamiento+"\n";
		mensaje+="Costo Medicamentos: "+costMedica+", num dias Hospital: "+numDiasHospital+"\n";
		mensaje+="Total hospitalización: "+valTotalDias+"\n";
		mensaje+=nombre+" El valor total por concepto de hospitalización es: "+valorTotal;
		
		System.out.println(mensaje);
		JOptionPane.showMessageDialog(null, mensaje);
		
		
		
}
}