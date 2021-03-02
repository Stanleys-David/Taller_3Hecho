/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_4;
import java.util.Scanner;

/**
 *
 * @author stanl
 */
public class Punto_1 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
        int i,n,sumaproducto,sumaproductovendidos,position = 0;
        sumaproductovendidos=0;
        sumaproducto=0;
        System.out.print("INTRODUCIR  NUMERO DE ELEMENTOS");
        n= entrada.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        

        //lectura de datos y llenar el array
        System.out.println("Intruduce los codigos de los productos");
        for (i = 0; i < n; i++) {
            System.out.printf("codigo del [ %d ] producto= ",i + 1);
            A[i] = entrada.nextInt();
        }
        System.out.println("Valor de venta de los productos");
        for (i = 0; i < n; i++) {
            System.out.printf("Valor del[ %d ]producto= ",i + 1);
            B[i] = entrada.nextInt();
            sumaproductovendidos=sumaproductovendidos + B[i];
        }
        System.out.println("cantidad vendida de cada producto");
        for (i = 0; i < n; i++) {
            System.out.printf("Producto[ %d ]= ",i +1);
            C[i] = entrada.nextInt();
            sumaproducto=sumaproducto + C[i];
        } 
        int mayor = C[0];
        for (i=0; i<C.length; i++){
            if (C[i]>mayor) {
                mayor = C[i];
                position= i;
            
            }
        }
        System.out.printf("\nTotal productos vendidos en el día = %d\n",sumaproducto);
        System.out.printf("Total ingresos por ventas del día\n = ");
        System.out.printf("Total ingresos por ventas del día = %d\n",sumaproductovendidos);
        System.out.printf("el mas vendido",A[position]);
    }   
}
    
