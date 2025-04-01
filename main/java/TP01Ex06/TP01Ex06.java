/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex06;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO - CB3021726
 * 6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
 */
public class TP01Ex06 {
     public static void main (String args[]){

System.out.println("Digite o primeiro digito: "); 
Scanner scan= new Scanner(System.in); 
double n1= scan.nextDouble();
System.out.println("Digite o segundo digito: "); 
double n2= scan.nextDouble();
System.out.println("Digite o terceiro digito: "); 
double n3= scan.nextDouble();
System.out.println("Digite o quarto digito: "); 
double n4= scan.nextDouble();
double media = (n1 + n2 + n3 + n4)/4;
System.out.println("A média dos digitos é : " + media);
}    
}

