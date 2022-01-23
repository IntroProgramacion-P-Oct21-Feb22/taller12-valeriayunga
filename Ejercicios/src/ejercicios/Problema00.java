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
public class Problema00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length));//17
    }

    public static int misterio(int[] arreglo, int tamanio) { 

        if (tamanio == 1) { //4==1|f//3==1|f//2==1|f//1==1|v
            return arreglo[0];//10
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
            //arreglo[3]+misterio(arreglo, 3)<--1+16=17
            //arreglo[2]+misterio(arreglo, 2)<--4+12=16
            //arreglo[1]+misterio(arreglo, 1)<--2+10=12
        }
    }

}
