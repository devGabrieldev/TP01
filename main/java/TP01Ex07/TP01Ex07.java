/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex07;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
 */
public class TP01Ex07 {
    public static void main (String args[]){        

Scanner scan= new Scanner(System.in);
System.out.println("Digite o primeiro digito: ");
double n1= scan.nextDouble();
System.out.println("Digite o segundo digito: "); 
double n2= scan.nextDouble();
double media = Math.sqrt(n1 * n2);
System.out.println("A média geométrica dos digitos é : " + media);
}
}

