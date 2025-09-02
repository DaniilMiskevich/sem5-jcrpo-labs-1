package demo.parallel;

import java.io.Console;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @org.junit.jupiter.api.Test
    void neg() {
        var a_neg = new Complex(2, 3).neg();
        var b_neg = new Complex(1, -1).neg();

        assertTrue(a_neg.getRe() == -2 && a_neg.getIm()==-3, "The number 'A' should be properly inverted!");
        assertTrue(b_neg.getRe() == -1 && b_neg.getIm()==1, "The number 'B' should be properly inverted!");
    }

    @org.junit.jupiter.api.Test
    void sub() {
        var a = new Complex(2, 3);
        var b = new Complex(1, -1);

        assertEquals(a.sub(b), new Complex(1, 4), "The number 'A - B' expression should be counted properly!");
    }
}