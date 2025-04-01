/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex05;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
 */
public class TP01Ex05 {
    
   public static void main (String args[]){

System.out.println("Digite o diametro da esfera: "); 
Scanner scan= new Scanner(System.in); 
double d= scan.nextDouble();
d = d/2;
double pi = Math.PI;
double volume = ((4.0/3.0*pi) * Math.pow(d,3));
System.out.println("O volume da esfera é : " + volume);
}
}


    

