# Taller12

## Problemáticas
### Problema 00
Dado el siguiente código; ejecute y analice la salida
```
public class Ejemplo00 {

    public static void main(String[] args) {
        int[] datos = {10, 2, 4, 1};
        System.out.printf("%d\n", misterio(datos, datos.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
```
#### Respuesta aquí
Lo que hace el programa es sumar los elementos de cada posición del arreglo datos utilizando la recursividad, al llamar desde la función principal a la función misterio utilizando los parámetros: datos(arreglo) con el nombre de "arreglo" y datos.length(numero de elementos del arreglo) con el nombre de "tamanio". Luego la función misterio utiliza el condicional "if", si la variable "tamanio" es igual a 1, la función retorna el valor del arreglo en posición o (10), de lo contrario, la función retorna el arreglo en posición del valor de tamanio menos 1, más la función misterio usando la arreglo y tamnio como parámetros, y de esta manera se da inicio a la recursividad, dando como resultado que se retorna el número 17 el cual se presenta en pantalla gracias al System.out.printf de l afunción principal.

Este programa se encuentra explicado más detalladamente en la prueba de escritorio que añadí como archivo exel.
#### Fin respuesta

***

### Problema 01
Dado el siguiente arreglo
```
double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
```

Use un método recursivo que permita encontrar el factorial de cada posición del arreglo. El resultado de cada posición debe ubicarlo en el siguiente arreglo

```
double[][] resultado = new double[4][2];
```
***

### Problema 02
Dado el siguiente arreglo
```
double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
```
A través de un método recursivo encuentre y presente la suma de la posición datos1[n][n] con la posición2[n][n], el resultado ubicarlo en un nuevo arreglo llamado datos3[n][n].
***

### Problema 03
Dado los siguientes arreglos
```
double[] datos = {100, 90, 80, 70, 60};
double[] datos2 = {200, 190, 180, 170, 160};
```

Encuentre la suma de las posiciones 0 de datos y datos2 (use un método recursivo) y el valor de la suma, asignarle a un arreglo llamado suma

```
double[] suma = new int[5];

```
***

### Problema 04

Dado los siguientes arreglos
```
double[] bases = {100, 90, 80, 70, 60};
double[] potencias = {2, 3, 2, 2, 1};
```

Encuentre la potencia de las posiciones 0 de datos(base) y datos2(potencia) , use un método recursivo; y el valor de la potencia, asignarle a un arreglo llamado resultado

```
double[] resultado = new int[5];
```

Finalmente, encuentre la suma de los valores del arreglo resultado a través de un método recursivo.


