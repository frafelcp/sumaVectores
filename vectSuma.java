/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumar_CienNumeros;

import java.util.Scanner;

//Realizar un algoritmo que lea una secuencia de 100 números como máximo y 
//los almacene en una estructura de tipo array. Posteriormente, se debe calcular 
//la suma de los N primeros números almacenados. El dato N es un número 
//introducido por un dispositivo de entrada.

/**
 *
 * @author Felix Castro
 */
public class sumCieNumeros {
    public static void main(String[] args) {
        //leer por teclado y consola
        Scanner entrada = new Scanner(System.in);
        
        //definimos variables y vector
        int [] numeros;
        int contar = 0;
        int num;
        int suma = 0;
        
        //damos tamaño al vector
        numeros = new int[100];
        
        //llenamos el vector
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = contar++;
        }        
        
        //ingresamo un numero
        System.out.println("Ingres un numero");
        num = entrada.nextInt();
        
        //sumamos dependiendo del numero ingresado
        for (int i = 0; i < num; i++) {
            suma = suma + numeros[i];
        }
        
        System.out.println("-------------------------------------");
        
        //imprimimos vector
        System.out.println("El vector completo es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]+" ");
        }
        
        System.out.println("-------------------------------------");
        
        //mostramos la suma
        System.out.println(suma);
    }
}
