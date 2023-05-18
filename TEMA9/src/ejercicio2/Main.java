package ejercicio2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	LinkedHashSet<String> palabras = new LinkedHashSet<String>();
	Scanner sc = new Scanner(System.in);
	String input="";
	
	System.out.println("INTRODUZCA PALABRAS:");
	input = sc.nextLine();
	while (!input.equalsIgnoreCase("fin")){
		palabras.add(input);
		System.out.println("INTRODUZCA PALABRAS:");
		input = sc.nextLine();
	}
	System.out.println(palabras);
	System.out.println("FIN DEL PROGRAMA");
	
	
	
	sc.close();
}
}
