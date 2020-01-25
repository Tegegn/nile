package com.purpose.nile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class NileServiceApplicationTests {

    @Disabled
    @Test
    void testShouldFail(){
        Assertions.fail();
    }

    @Test
    void test(){
        Assertions.assertFalse(true);
    }
}
