package Taller;

public class IMC {
	
    public static double[] calcularIMC(double[] infoAltura, double[] infoPeso) {
    	
        int cantidad = Math.min(infoAltura.length, infoAltura.length);
        double[] imcResultados = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            double peso = infoPeso[i];
            double altura = infoAltura[i];

            double imc = peso / (altura * altura);
            imcResultados[i] = imc;
        }

        return imcResultados;
    }
}
