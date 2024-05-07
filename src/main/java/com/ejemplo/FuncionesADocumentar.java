package com.ejemplo;

public class FuncionesADocumentar {

    public static void main(String[] args) {

        int a[] = {7, 14, 9, 18, 11, 6, 13, 12, 1, 5, 4, 3, 2, 8, 10};

        System.out.println("La suma de los elementos del arreglo es: " + suma(a));
        System.out.println("El promedio de los elementos del arreglo es: " + promedio(a));
        System.out.println("El mayor de los elementos del arreglo es: " + mayor(a));
        System.out.println("El menor de los elementos del arreglo es: " + menor(a));
        System.out.println("El arreglo invertido es: ");
        invertir(a);
        System.out.println("El arreglo ordenado es: ");
        ordenar(a);
    }

    /**
     * Calcula la suma de todos los elementos de tipo entero de una lista
     * @param a Array de enteros
     * @return La suma de todos los enteros del array a
     */
    public static int suma(int a[]) {
        int suma = 0;
        for (int i = 0; i < a.length; i++)
            suma += a[i];
        return suma;
    }

    /**
     * Calcula la media de los elementos de una lista de enteros
     * @param a Array de enteros
     * @return La media de los elementos del array a
     */
    public static double promedio(int a[]) {
        return suma(a) / a.length;
    }

    /**
     * Devuelve el mayor elemento de una lista de enteros
     * @param a Array de enteros
     * @return El mayor número del array a
     */
    public static int mayor(int a[]) {
        int mayor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > mayor)
                mayor = a[i];
        return mayor;
    }

    /**
     * Devuelve el elemento más pequeño de una lista de enteros
     * @param a Array de enteros
     * @return El elemento más pequeño del array a
     */
    public static int menor(int a[]) {
        int menor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < menor)
                menor = a[i];
        return menor;
    }

    /**
     * Invierte el order de una lista de enteros
     * @param a Array de enteros
     */
    public static void invertir(int a[]) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    /**
     * Ordena de menor a mayor una lista de enteros, además de imprimirla
     * @param a Array de enteros
     */
    public static void ordenar(int a[]) {
        int aux;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i; j < a.length; j++)
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
