package com.bookstore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testBookStoreMessage() {
        String message = "Online Book Store Application";

        assertEquals("Online Book Store Application", message);
    }
}