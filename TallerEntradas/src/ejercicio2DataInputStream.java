import java.io.DataInputStream;
import java.io.IOException;

public class ejercicio2DataInputStream {
public static void main(String[] args) throws IOException{
DataInputStream entrada = new DataInputStream(System.in);
String num = ""; 
int valorA = 0; 
int valorB = 0; 

System.out.print ("Digite un valor para A: ");
num = entrada.readLine();
valorA = Integer.parseInt(num);
System.out.println("El valor A es: " + valorA);


System.out.print ("Digite un valor para B: ");
num = entrada.readLine();
valorB = Integer.parseInt(num);
System.out.println("El valor B es: " + valorB);

int suma = valorA + valorB;

System.out.println("La suma de los valores A y B es: " + suma);
}
}