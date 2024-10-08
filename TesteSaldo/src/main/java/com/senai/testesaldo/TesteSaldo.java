/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senai.testesaldo;

/**
 *
 * @author rafael_t_moraes
 */
public class TesteSaldo {

    public static void main(String[] args) {
        
        Conta c1 = new Conta(100.0);
        c1.sacar(50);
        System.out.println(c1.getSaldo());
        c1.sacar(40);
        System.out.println(c1.getSaldo());
        c1.sacar(50);
        System.out.println(c1.getSaldo());
    }
}
