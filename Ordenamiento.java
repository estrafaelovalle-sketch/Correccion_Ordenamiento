package correccionoredenamiento;
import java.util.Scanner;
import java.util.Arrays;

public class Ordenamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();

        int arr[] = new int[n];


        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento [" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        ordenar(arr);


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
