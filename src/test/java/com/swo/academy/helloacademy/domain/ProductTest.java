package com.swo.academy.helloacademy.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest {


    @Test
    public void priceShouldDefaultToZero() {
        Product product = new Product();
        assertEquals(0, product.getPrice());
    }

    @Test
    public void returnsPriceCorrectly() {
        Product product = new Product(55.99);
        assertEquals(55.99, product.getPrice());

    }


    @Test
    public void titleShouldBeGreaterThanFiveCharacters() {
        Product product = new Product();
        assertTrue(product.getTitle().length() > 5);
    }

}
