/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shopify.prettyprices;

import java.math.BigDecimal;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *
 * @author Swati
 */
public class PriceConverterTest {
    private PriceConverter instance;

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testConvertUpToNearestQuarter() {
        System.out.println("convert UP to nearest quarter");
        instance = new PriceConverter(new BigDecimal(1.5));
        BigDecimal expected = new BigDecimal(8.0);
        BigDecimal actual = instance.convert(new BigDecimal(5.15));
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testConvertDownToNearestQuarter() {
        System.out.println("convert DOWN to nearest quarter");
        instance = new PriceConverter(new BigDecimal(1.5));
        BigDecimal expected = new BigDecimal(8.50);
        BigDecimal actual = instance.convert(new BigDecimal(5.70));
        
        assertEquals(expected, actual);
    }
}
