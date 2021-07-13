package com.swo.academy.helloacademy.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BookTest {

    @Test
    public void numOfPagesIsGreaterThanZero() {
        Book book = new Book();
        assertTrue(book.getNumOfPages() > 0);
    }

    @Test
    public void titleIsNotEmpty() {
        Book book = new Book();
        assertTrue(book.getTitle().length() > 0);

    }

    @Test
    public void superClassTest() {
        assertTrue(new Book() instanceof Book);
        assertTrue(new Book() instanceof Product);
        assertTrue(new Book() instanceof Object);


        assertFalse(new Product() instanceof Book);
        assertTrue(new Product() instanceof Object);
    }
}
