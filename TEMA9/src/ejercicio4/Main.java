package ejercicio4;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		TreeMap<Integer, Integer> estrellas = new TreeMap<>();

		int num;
		int estrella;
		String opcion = "";
		Scanner sc = new Scanner(System.in);

		System.out.println("¿SEGUIR INTRODUCIENDO? (S/N)");
		opcion = sc.next();
		sc.nextLine();

		while (opcion.equals("S")) {
			System.out.println("INTRODUCIR 5 NÚMEROS: ");
			for (int i = 0; i < 5; i++) {
				num = sc.nextInt();
				sc.nextLine();
				if (numeros.containsKey(num)) {
					numeros.replace(num, numeros.get(num) + 1);
				} else {
					numeros.put(num, 1);
				}
			}
			System.out.println("INTRODUCIR 2 ESTRELLAS: ");
			for (int i = 0; i < 2; i++) {
				estrella = sc.nextInt();
				sc.nextLine();
				if (estrellas.containsKey(estrella)) {
					estrellas.replace(estrella, estrellas.get(estrella) + 1);
				} else {
					estrellas.put(estrella, 1);
				}
			}

			System.out.println("¿SEGUIR INTRODUCIENDO? (S/N)");
			opcion = sc.next();
			sc.nextLine();
		}

		System.out.println("NÚMEROS: " + numeros);
		System.out.println("ESTRELLAS: " + estrellas);

		sc.close();
	}
}
