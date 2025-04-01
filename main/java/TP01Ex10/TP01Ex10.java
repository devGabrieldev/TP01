/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex10;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
 */
public class TP01Ex10 {
   public static void main (String args[]){ 

Scanner scan= new Scanner(System.in);
System.out.println("Digite a temperatura em Celsius: ");
double cel= scan.nextDouble();
double fht = (cel * 9.0/5.0)+ 32;
System.out.println("A temperatura em Fahrenheit é: " + fht);
scan.close();
}
 }
