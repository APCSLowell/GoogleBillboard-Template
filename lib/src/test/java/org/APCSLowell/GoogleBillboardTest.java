package org.APCSLowell;

import org.junit.Test;
import static org.junit.Assert.*;

public class GoogleBillboardTest {
    @Test
    public void testIsPrime() {
        GoogleBillboard googleBillboard = new GoogleBillboard();
        assertEquals(googleBillboard.isPrime(3), true);
        assertEquals(googleBillboard.isPrime(4), false);
        assertEquals(googleBillboard.isPrime(5), true);
        assertEquals(googleBillboard.isPrime(6), false);
        assertEquals(googleBillboard.isPrime(7), true);
        assertEquals(googleBillboard.isPrime(8), false);
        assertEquals(googleBillboard.isPrime(9), false);
        assertEquals(googleBillboard.isPrime(10), false);
        assertEquals(googleBillboard.isPrime(11), true);
    }

    @Test
    public void testfirst10DigitPrimeInString() {
        String e = "27182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";
        
        GoogleBillboard googleBillboard = new GoogleBillboard();
        assertEquals(googleBillboard.first10DigitPrimeInString(e), 7427466391L);
    }
}
