/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package TP01Ex01;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class TP01Ex01 {

   public static void main(String args[]){
 //1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
//área.
System.out.println("Digite a base do retangulo: "); 
Scanner scan= new Scanner(System.in); 
double base= scan.nextDouble();
System.out.println("Digite a altrua do retangulo: ");
double alt= scan.nextDouble();
double area = (base * alt);
System.out.println("A area do retangulo é : " + area);
}
}
   
   



