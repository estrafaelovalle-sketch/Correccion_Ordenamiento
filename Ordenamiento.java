package correccionoredenamiento;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Ordenamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Pedir tamaño del arreglo
        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Generar números aleatorios
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(201) - 100; // números entre -100 y 100
        }

        // Mostrar arreglo original
        System.out.println("Arreglo generado:");
        System.out.println(Arrays.toString(arr));

        // Ordenar
        ordenar(arr);

        // Mostrar arreglo ordenado
        System.out.println("Arreglo ordenado:");
        System.out.println(Arrays.toString(arr));
    }

    private static void ordenar(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] > v[j]) {
                    int w = v[j];
                    v[j] = v[i];
                    v[i] = w;
                }
            }
        }
    }
}