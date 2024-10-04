package com.senai.lojadedepartamento;

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

/**
 *
 * @author rafael_t_moraes
 */
public class PessoaTest {
    
    public PessoaTest() {
    }
    
   

    /**
     * Test of getNome method, of class Pessoa.
     */
    //@Test
    public void testGetNome() {
        System.out.println("getNome");
        Pessoa instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNasc method, of class Pessoa.
     */
    //@Test
    public void testGetDataNasc() {
        System.out.println("getDataNasc");
        Pessoa instance = null;
        LocalDate expResult = null;
        LocalDate result = instance.getDataNasc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdade method, of class Pessoa.
     */
    //@Test
    public void testGetIdade() {
        System.out.println("getIdade");
        //Pessoa instance = new Pessoa("Teodoro", LocalDate.of(2000, 5, 14));
        int expResult = 24;
        int result = instance.getIdade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
