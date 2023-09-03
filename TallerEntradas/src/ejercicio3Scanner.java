import java.util.Scanner;
import java.io.*;

public class ejercicio3Scanner {

public static void main (String [] args) throws IOException{
Scanner input = new Scanner(System.in);
String num = "";
int valorA = 0; 
int valorB = 0; 

System.out.print ("Digite un valor para A: ");
num = input.next();
valorA = Integer.parseInt(num);
System.out.println("El valor A es: " + valorA);


System.out.print ("Digite un valor para B: ");
num = input.next();
valorB = Integer.parseInt(num);
System.out.println("El valor B es: " + valorB);

int suma = valorA + valorB;

System.out.println("La suma de los valores A y B es: " + suma);
}
}


