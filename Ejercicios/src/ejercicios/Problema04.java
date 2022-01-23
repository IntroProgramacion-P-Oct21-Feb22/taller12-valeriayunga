/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
        double[] suma = new double[5];

        for (int i = 0; i < bases.length; i++) {
            double potencia = obtenerPotencia(bases[i], potencias[i]);
            resultado[i] = potencia;

            double sumaR = obtenerSuma(bases[i], potencias[i]);
            suma[i] = sumaR;

            System.out.printf("La suma de %.2f + %.2f es: %.2f\tCon potencia "
                    + "de : %.2f\n",
                    bases[i], potencias[i], suma[i], resultado[i]);
        }

    }

    public static double obtenerSuma(double a, double b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }

    }

    public static double obtenerPotencia(double base, double exponente) {

        if (exponente == 1) {
            return base;
        } else {

            return base * obtenerPotencia(base, exponente - 1);
        }
    }

}
