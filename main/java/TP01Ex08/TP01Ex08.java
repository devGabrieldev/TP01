/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex08;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
 */
public class TP01Ex08 {
    public static void main (String args[]){
 
Scanner scan= new Scanner(System.in);
System.out.println("Digite a distancia em milhas marítimas: "); 
double milha= scan.nextDouble();
double km = (milha * 1.852) ;
System.out.println("A distância em quilômetros é : " + km);
}
}

