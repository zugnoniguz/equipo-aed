package com.ut1_ta2;

public class UtilMath {

    public static int factorial(int numero) {

        int factorial = 1;

        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo");
        }
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;

    }

    public static boolean esPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int Sumatoria (int numero) {
        int sumatoria = 0;
        if (esPrimo(numero) == false) {
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) {
                    sumatoria += i;
                }
            }
        } else {
            for (int i = 1; i <= numero; i++) {
                if (i % 2 != 0) {
                    sumatoria += i;
                }
            }
        }
        return sumatoria;
        
    }
}
