package kkl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaleTest {
    @Test
    public void addtest() {

        assertEquals(14, Cale.add(5, 9));
    }
    @Test
    public void subtracttest() {
        assertEquals(6,Cale.subtract(8,2));

    }
}