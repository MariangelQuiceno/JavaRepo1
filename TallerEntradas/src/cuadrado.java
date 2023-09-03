import java.io.*;

public class cuadrado {

public static void main(String[] args) throws IOException {
BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
String num = ""; // Variable que almacena los valores ingresados
int numero = 0; // Variable que almacenra el valor ingresado
int cuad = 0; // Variable que guardara el resultado
System.out.print ("Digite un numero: "); //Se le al usuario que digite el numero
num = entrada.readLine(); //Lectura del valor ingresado
numero = Integer.parseInt(num); //Se convierte el String a Int
cuad = numero*numero; //Se indica la operacion, para que el resultado se guarde en la variable
System.out.println("El cuadrado de " + numero + " es : " + cuad);
}
}