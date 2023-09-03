package Taller;


public class DatosListas {

	public static double[] infoAltura() {
        double[] alturas = EditorDatosIMC.guardarAltura(); 
        System.out.println("Alturas ingresadas:");
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Altura " + (i + 1) + ": " + alturas[i]);
        }
		return alturas;
    }


public static double[] infoPeso() {
    double[] pesos = EditorDatosIMC.guardarPeso(); 
    System.out.println("Datos de peso Ingresados:");
    for (int i = 0; i < pesos.length; i++) {
        System.out.println("Peso " + (i + 1) + ": " + pesos[i]);
    }
	return pesos;
}

}