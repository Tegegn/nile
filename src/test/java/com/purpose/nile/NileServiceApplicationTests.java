package com.purpose.nile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NileServiceApplicationTests {


    @Test
    void testPass(){
        Assertions.assertTrue(true);
    }

    @Test
    void test(){
        Assertions.assertFalse(false);
    }
}
