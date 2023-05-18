package ejercicio3;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {

	TreeSet<String> palabras = new TreeSet<String>();
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
