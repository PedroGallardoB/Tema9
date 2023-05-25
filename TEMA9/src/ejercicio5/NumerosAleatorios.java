package ejercicio5;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();


        Random random = new Random();
        while (numeros.size() < 20) {
            int numero = random.nextInt(100);
            numeros.add(numero);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
