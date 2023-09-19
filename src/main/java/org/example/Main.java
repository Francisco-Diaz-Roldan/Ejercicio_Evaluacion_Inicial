package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = 1;
        int max = 1;
        int totalPrimos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("BUSCADOR DE PRIMOS");
        System.out.println("==================");

do {
    System.out.println("Escribe el numero inicial (0 para salir)");
    min = sc.nextInt();

    if (min != 0) {
        System.out.println("Escribe el numero final:");
        max = sc.nextInt();
        System.out.println("Buscando primos...");

        for (int i = min; i <= max; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
                totalPrimos++;
            }
        }
        System.out.println("Se han encontrado " + totalPrimos + " numeros primos en el intervalo.");
    }

}while (min != 0);
sc.close();
    }

    public static boolean esPrimo(int max){
        boolean primo = true;
        for (int i = 2; i < max; i++) {
            if (max % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

}


