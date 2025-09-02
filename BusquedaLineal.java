import java.util.Scanner;

public class BusquedaLineal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Tamaño del arreglo: ");
        int tamanio = entrada.nextInt();

        int[] numeros = new int[tamanio];
        System.out.println("Ingrese " + tamanio + " números:");
        for (int indice = 0; indice < tamanio; indice++) {
            numeros[indice] = entrada.nextInt();
        }

        System.out.print("Ingresa el número a localizar: ");
        int objetivo = entrada.nextInt();

        // Llamamos a la función de busqueda lineal
        int comparaciones = localizar(numeros, objetivo);

        System.out.println("Comparaciones realizadas: " + comparaciones);

        // Verificamos si se encontro o no
        if (comparaciones <= tamanio && numeros[comparaciones - 1] == objetivo) {
            System.out.println("El número fue encontrado");
        } else {
            System.out.println("El número no se encuentra en el arreglo");
        }

        entrada.close();
    }

    // Funcion de busqueda lineal que retorna el número de comparaciones realizadas
    public static int localizar(int[] lista, int buscado) {
        int contador = 0;

        for (int posicion = 0; posicion < lista.length; posicion++) {
            contador++;
            if (lista[posicion] == buscado) {
                break; // Se detiene al encontrar el número
            }
        }

        return contador;
    }
}
