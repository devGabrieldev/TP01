/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex17;

import java.util.Scanner;

/**
 *@author GABRIEL RIBEIRO - CB3021726
 * 17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
  cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.
 */
public class TP01Ex17 {
   public static void main(String args []){
Scanner scan= new Scanner(System.in);
System.out.println("Digite valor de X: ");
double x= scan.nextDouble();
System.out.println("Digite o valor de Y: ");
double y= scan.nextDouble();
double calc = Math.exp(y * Math.log(x));
System.out.println("O cálculo de XY (“X” elevado a “Y”) é: " + calc);
scan.close();
}
}
