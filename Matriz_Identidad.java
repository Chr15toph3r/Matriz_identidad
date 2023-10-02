//Generador de matrices identidad - Estructura de datos ejercicio 1
package matriz_identidad;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz_Identidad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nfilas = 0, ncolumnas = 0, tamañomatriz, interfaz;
        String matrizconsola;
        //
        tamañomatriz = Integer.parseInt(JOptionPane.showInputDialog("Indique el tamaño de la matriz:" + "\n(El numero minimo es 2 y el 10 es el maximo)"));
        while((tamañomatriz<=1) || (tamañomatriz>10)){ //
            JOptionPane.showMessageDialog(null, "\n Debe escribir numeros validos (del 2 al 10)");    
            tamañomatriz = Integer.parseInt(JOptionPane.showInputDialog("Indique el tamaño de la matriz:" + "\n(El numero minimo es 2 y el 10 es el maximo)")); //Si la persona ingresa un numero invalido se le da la opcion de volver 
        } 
        JOptionPane.showMessageDialog(null, "\n El tamaño de la matriz es: " + tamañomatriz + "x" + tamañomatriz);
        matriz = new int[tamañomatriz][tamañomatriz];
            for (int i = 0; i < tamañomatriz; i++) {
               for (int j = 0; j < tamañomatriz; j++) {
                   if(i == j) {                             
                       matriz[i][j] = 1;                  
                   }                        //hice que el algoritmo detectara que si i y j son iguales, y de ser asi que coloque un 1 y si no, un 0 
                   else {
                       matriz[i][j] = 0;
                   }
               }
                 
         }
        matrizconsola = "La matriz es:\n";              //esta parte se encarga de la impresion de lo anterior
        for (int i = 0; i < tamañomatriz; i++) {        
        matrizconsola += "\n";           
            for (int j = 0; j < tamañomatriz; j++) 
            matrizconsola += matriz[i][j];
 
        }
        JOptionPane.showMessageDialog(null, matrizconsola); //remplace el sout con esto joptionpane para que se vea en consola 
    }
}

