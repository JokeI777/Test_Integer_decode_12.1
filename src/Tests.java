import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    @Test
    public void testNegativeNumber(){
        assertEquals(-777, (int) Integer.decode("-777"));
    }

    @Test
    public void testPositiveNumber(){
        assertEquals(777, (int) Integer.decode("777"));
    }

    @Test(expected = NullPointerException.class)
    public void testNull(){
        Integer.decode(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testEmptyString(){
        Integer.decode("");
    }

    @Test
    public void testZero(){
        assertEquals(0, (int) Integer.decode("0"));
    }

    @Test
    public void testPositiveHexadecimal(){
        assertEquals(2554, (int) Integer.decode("0X9fa"));
        assertEquals(4095, (int) Integer.decode("0xfff"));
    }

    @Test
    public void testNegativeHexadecimal(){
        assertEquals(-2554, (int) Integer.decode("-0X9fa"));
        assertEquals(-4095, (int) Integer.decode("-0xfff"));
    }

    @Test(expected = NumberFormatException.class)
    public void testNotNumber(){
        Integer.decode("Exception");
    }

    @Test
    public void testMinMaxValue(){
        assertEquals(Integer.MAX_VALUE, (int) Integer.decode("" + Integer.MAX_VALUE));
        assertEquals(Integer.MIN_VALUE, (int) Integer.decode("" + Integer.MIN_VALUE));
    }
}
