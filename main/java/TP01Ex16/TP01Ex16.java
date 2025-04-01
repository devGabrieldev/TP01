/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP01Ex16;

import java.util.Scanner;

/**
 *
 * @author GABRIEL RIBEIRO CB3021726
 * 16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as        
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
 */
public class TP01Ex16 {
    public static void main (String args[]){
Scanner scan = new Scanner(System.in);        
System.out.print("Digite o valor do ângulo em graus: ");
double graus = scan.nextDouble();        
// Convertendo graus para radianos
double radianos = Math.toRadians(graus); //(fórmula = radianos=graus×π/180)
double seno = Math.sin(radianos);
double cosseno = Math.cos(radianos);
double tangente = Math.tan(radianos);        
// Cálculo da secante (1/cosseno)
double secante = (cosseno != 0) ? 1 / cosseno : Double.POSITIVE_INFINITY; // Evita divisão por zero
System.out.println("Seno (sin(x)= cat.oposto/hipotenusa): " + seno);
System.out.println("Cosseno (cos(x)= cat.adjacente/hipotenusa): " + cosseno);
System.out.println("Tangente: (tan(x)= sin(x)/cos(x))" + tangente);
System.out.println("Secante: (sec(x)= 1/cos(x)" + secante);
scan.close();
}
}
