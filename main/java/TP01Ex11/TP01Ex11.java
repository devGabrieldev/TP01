/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex11;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
 */
public class TP01Ex11 {
    public static void main (String args[]){

Scanner scan= new Scanner(System.in); 
System.out.println("Digite o diâmetro do círculo: ");
double d= scan.nextDouble();
double pi = Math.PI;
double area = pi*Math.pow(d/2, 2);
System.out.println("A área do circulo é: " + area);
scan.close();
}
}
