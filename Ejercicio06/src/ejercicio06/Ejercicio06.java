/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author utpl
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var = 81;
        int var1 = 9;
        int var2 = 3;
        int var3 = 9;
        int var4 = 10;
        int var5 = 1;
        
        boolean res1 = ((Math.sqrt(var)+var1)/ var2)==var3; //falso
        boolean rest2 = var4>var5; //verdadero
        
        boolean resultado = res1 && rest2; //falso
        
        System.out.println(resultado);
    }
    
}
