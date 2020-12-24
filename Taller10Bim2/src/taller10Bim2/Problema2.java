/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller10Bim2;

import java.util.Scanner;

/**
 *
 * @author xavierchavez
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vendedores = new String[2];
        vendedores[0] = "Jessica cole";
        vendedores[1] = "Robert Wallace";
        double[][] ventas = new double[2][5];
        double valor;
        double suma = 0;

        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.printf("Ingrese el valor de ventas para %s\n",
                        vendedores[fila]);
                valor = entrada.nextDouble();
                ventas[fila][columna] = valor;
                suma = suma + ventas[fila][columna];

            }

        }

        System.out.printf("Vendedor(a) %s\nVendedor(a) %s\nHa realizado un "
                + "total de %.2f en ventas.\n",
                vendedores[0], vendedores[1], suma);

    }

}
