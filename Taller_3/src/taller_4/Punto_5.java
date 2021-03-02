package taller_4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author stanl
 */
public class Punto_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
                Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        Scanner entrada = new Scanner (System.in);
                        System.out.println("Has seleccionado la opcion de binario a decimal");
                  
                        long numero, aux, digito, decimal;
                             int exponente;
                             boolean esBinario;
                             

                            //Leer un número por teclado y comprobar que es binario
                             do {
                                  System.out.print("Introduce un numero binario: ");
                                  numero = sc.nextLong();
                                  //comprobamos que sea un número binario es decir
                                  //que este formado solo por ceros y unos
                                  esBinario = true;
                                  aux = numero;
                                  while (aux != 0) {
                                             digito = aux % 10; //última cifra del números
                                             if (digito != 0 && digito != 1) { //si no es 0 ó 1
                                                  esBinario = false; //no es un número binario
                                             }
                                             aux = aux / 10; //quitamos la última cifra para repetir el proceso                           
                                   }
                              } while (!esBinario); //se vuelve a pedir si no es binario

                              //proceso para pasar de binario a decimal
                              exponente = 0;
                              decimal = 0; //será el equivalente en base decimal
                              while (numero != 0) {
                                        //se toma la última cifra
                                        digito = numero % 10;
                                        //se multiplica por la potencia de 2 correspondiente y se suma al número                          
                                        decimal = decimal + digito * (int) Math.pow(2, exponente);
                                        //se aumenta el exponente
                                        exponente++;
                                        //se quita la última cifra para repetir el proceso
                                        numero = numero / 10;
                              }
                              System.out.println("Decimal: " + decimal);

                              
                              
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        
                        int numero, exp, digito;
                        double binario;
                        do{ 
                            System.out.print("Introduce un numero entero >= 0: ");                                                
                            numero = sc.nextInt();
                        }while(numero < 0);

                        exp=0;
                        binario=0;
                        while(numero!=0){
                                digito = numero % 2;           
                                binario = binario + digito * Math.pow(10, exp);                                                   
                                exp++;
                                numero = numero/2;
                        }
                        System.out.printf("Binario: %.0f %n", binario);
                    
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
 
}
