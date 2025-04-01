/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex09;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 *  9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
 */
public class TP01Ex09 {
    public static void main (String args[]){

Scanner scan= new Scanner(System.in);
System.out.println("Digite a corrente do circuito: "); 
double amp= scan.nextDouble();
System.out.println("Digite a tensão do circuito: ");
double res = scan.nextDouble();
double ten = (amp *res);
System.out.println("A area do quadrado é : " + ten);
}
}
