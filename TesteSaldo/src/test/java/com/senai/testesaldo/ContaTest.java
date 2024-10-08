package com.senai.testesaldo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {
    
    public ContaTest() {
    }
    
    @Test
    public void construtorTest(){
        Conta c1 = new Conta(150.0);
        double expResult = 150.0;
        assertEquals(expResult, c1.getSaldo());
    }

    /**
     * Test of depositar method, of class Conta.
     */
//    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double valor = 0.0;
        Conta instance = null;
        instance.depositar(valor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sacar method, of class Conta.
     */
    @Test
    public void testSacarValido() {
        Conta c1 = new Conta(150.0);
        double expResult = 100.0;
        double valor = 50.0;
        c1.sacar(valor);
        assertEquals(expResult, c1.getSaldo());
    }
    @Test
    public void testSacarInvalido() {
        //System.out.println("sacar");
        Conta c1 = new Conta(150.0);
        double valor = 160.0;
        try{
            c1.sacar(valor);
            fail("Permitiu saque superior ao saldo");
        }catch(IllegalArgumentException iae){
            assertEquals("Valor superior ao saldo", iae.getMessage());
        }catch(Exception e){
            fail("Exceção incorreta");
        }
    }

    /**
     * Test of getSaldo method, of class Conta.
     */
//    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Conta instance = null;
        double expResult = 0.0;
        double result = instance.getSaldo();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
