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
public class Punto_10 {

    /**
     * @param args the command line arguments
   class InvertirNumero {

   public static void main( String[] args ) {
      int numero, invertido = 0, resto;

      Scanner s = new Scanner( System.in );
      System.out.println( "Ejemplo para la inversión de un número" );
      System.out.println( "Introduce un número: " );
  */
    public static void main(String[] args) {
        int numero, invertido = 0, resto;
        Scanner s = new Scanner (System.in);
        System.out.println( "Programa que te invierte un numero");
        System.out.println("Introduzca un numero  :");
        numero = s.nextInt();
        while(numero>0){
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /=10;
        }
        System.out.println("Numero invertido es:  " + invertido);
    }
}
    


