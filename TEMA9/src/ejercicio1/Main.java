package ejercicio1;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    	 int numeroAleatorio = 0;
        TreeSet<Integer> numeros = new TreeSet<Integer>();
        
        while (numeros.size() < 20) {
            numeroAleatorio = (int) (Math.random() * 100);
            numeros.add(numeroAleatorio);
        }
        
        System.out.println("Resultado:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
