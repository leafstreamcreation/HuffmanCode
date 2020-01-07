//StringOfBitsTest.Java
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Tests for StringOfBits.
 * @author  Derek Noble
 */
public class StringOfBitsTest {

    /**
     * Tests valid construction for empty StringOfBits.
     */
    @Test
    public void emptyStringTest() {
        StringOfBits emptyString = new StringOfBits();
        assertEquals(0, emptyString.length());
    }

    /**
     * Tests valid construction for nonempty StringOfBits.
     */
    @Test
    public void newStringTest() {
        String foo = "011";
        StringOfBits newString = new StringOfBits(foo);
        assertEquals(foo, newString.toString());
    }

    /**
     * Tests valid construction for copying a StringOfBits.
     */
    @Test
    public void copyStringTest() {
        StringOfBits firstString = new StringOfBits("011");
        StringOfBits newString = new StringOfBits(firstString);
        assertEquals("011", newString.toString());
        assertEquals(firstString.toString(), newString.toString());
    }
//assert equals compares longs and objects
    /**
     * Tests proper boolean appending
     */
    @Test
    public void appendBooleanTest() {
        StringOfBits emptyString = new StringOfBits();
        emptyString.append(false);
        assertEquals("0", emptyString.toString());
        assertEquals(1, emptyString.length());
        emptyString = new StringOfBits();
        emptyString.append(true);
        assertEquals("1", emptyString.toString());
        assertEquals(1, emptyString.length());

        StringOfBits newString = new StringOfBits("011");
        newString.append(false);
        assertEquals("0110", newString.toString());
        assertEquals(4, newString.length());
        newString = new StringOfBits("011");
        newString.append(true);
        assertEquals("0111", newString.toString());
        assertEquals(4, newString.length());
    }

    /**
     * Tests proper char appending
     */
    @Test
    public void appendCharTest() {
        StringOfBits emptyString = new StringOfBits();
        emptyString.append('0');
        assertEquals("0", emptyString.toString());
        assertEquals(1, emptyString.length());
        emptyString = new StringOfBits();
        emptyString.append('1');
        assertEquals("1", emptyString.toString());
        assertEquals(1, emptyString.length());

        StringOfBits newString = new StringOfBits("011");
        newString.append('0');
        assertEquals("0110", newString.toString());
        assertEquals(4, newString.length());
        newString = new StringOfBits("011");
        newString.append('1');
        assertEquals("0111", newString.toString());
        assertEquals(4, newString.length());
    }

    /**
     * Tests proper string appending
     */
    @Test
    public void appendCharSequenceTest() {
        StringOfBits emptyString = new StringOfBits();
        emptyString.append("110");
        assertEquals("110", emptyString.toString());
        assertEquals(3, emptyString.length());

        StringOfBits newString = new StringOfBits("011");
        newString.append("011");
        assertEquals("011011", newString.toString());
        assertEquals(6, newString.length());
    }

    /**
     * Tests proper int appending
     */
    @Test
    public void appendIntegerTest() {
        StringOfBits emptyString = new StringOfBits();
        emptyString.append(0);
        assertEquals("0", emptyString.toString());
        assertEquals(1, emptyString.length());
        emptyString = new StringOfBits();
        emptyString.append(1);
        assertEquals("1", emptyString.toString());
        assertEquals(1, emptyString.length());

        StringOfBits newString = new StringOfBits("011");
        newString.append(0);
        assertEquals("0110", newString.toString());
        assertEquals(4, newString.length());
        newString = new StringOfBits("011");
        newString.append(1);
        assertEquals("0111", newString.toString());
        assertEquals(4, newString.length());
    }

    /**
     * Tests proper StringOfBits appending
     */
    @Test
    public void appendStringOfBitsTest() {
        StringOfBits foo = new StringOfBits("011");
        
        StringOfBits emptyString = new StringOfBits();
        emptyString.append(foo);
        assertEquals(foo.toString(), emptyString.toString());
        assertEquals(foo.length(), emptyString.length());

        StringOfBits newString = new StringOfBits("011");
        newString.append(foo);
        assertEquals("011011", newString.toString());
        assertEquals(6, newString.length());
    }

    /**
     * Tests boolean at index retrieval
     */
    @Test
    public void booleanAtTest() {
        StringOfBits newString = new StringOfBits("01");
        assertTrue(newString.booleanAt(1));
        assertFalse(newString.booleanAt(0));
        newString = new StringOfBits("10");
        assertTrue(newString.booleanAt(0));
        assertFalse(newString.booleanAt(1));
    }

    /**
     * Verifies boolean at out of bounds index exception
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void booleanPastBoundsTest() {
        StringOfBits newString = new StringOfBits("01");
        boolean fail = newString.booleanAt(2);
    }

    /**
     * Verifies boolean at out of bounds index exception
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void booleanBeforeBoundsTest() {
        StringOfBits newString = new StringOfBits("01");
        boolean fail = newString.booleanAt(-1);
    }

    /**
     * Tests character at index retrieval
     */
    @Test
    public void characterAtTest() {
        StringOfBits newString = new StringOfBits("01");
        assertTrue('1' == newString.charAt(1));
        assertFalse('1' == newString.charAt(0));
        newString = new StringOfBits("10");
        assertTrue('1' == newString.charAt(0));
        assertFalse('1' == newString.charAt(1));
    }

    /**
     * Verifies character at out of bounds index exception
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void characterPastBoundsTest() {
        StringOfBits newString = new StringOfBits("01");
        char fail = newString.charAt(2);
    }

    /**
     * Verifies character at out of bounds index exception
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void characterBeforeBoundsTest() {
        StringOfBits newString = new StringOfBits("01");
        char fail = newString.charAt(-1);
    }

    /**
     * Tests integer at index retrieval
     */
    @Test
    public void integerAtTest() {
        StringOfBits newString = new StringOfBits("01");
        assertTrue(1 == newString.intAt(1));
        assertFalse(1 == newString.intAt(0));
        newString = new StringOfBits("10");
        assertTrue(1 == newString.intAt(0));
        assertFalse(1 == newString.intAt(1));
    }

    /**
     * Verifies integer at out of bounds index exception
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void integerPastBoundsTest() {
        StringOfBits newString = new StringOfBits("01");
        int fail = newString.intAt(2);
    }

    /**
     * Verifies integer at out of bounds index exception
     */
    @Test(expected = IndexOutOfBoundsException.class)
    public void integerBeforeBoundsTest() {
        StringOfBits newString = new StringOfBits("01");
        int fail = newString.intAt(-1);
    }


    /**
     * Tests StringOfBits length output
     */
    @Test
    public void lengthTest() {
        StringOfBits emptyString = new StringOfBits();
        assertEquals(0, emptyString.length());
        StringOfBits newString = new StringOfBits("011");
        assertEquals(3, newString.length());
    }

    /**
     * Tests boolean setBitAt method
     */
    @Test
    public void setBitBooleanTest() {
        StringOfBits newString = new StringOfBits("01");
        newString.setBitAt(0, true);
        assertEquals("11", newString.toString());
        newString.setBitAt(1, false);
        assertEquals("10", newString.toString());
    }

    /**
     * Tests character setBitAt method
     */
    @Test
    public void setBitCharacterTest() {
        StringOfBits newString = new StringOfBits("01");
        newString.setBitAt(0, '1');
        assertEquals("11", newString.toString());
        newString.setBitAt(1, '0');
        assertEquals("10", newString.toString());
    }

    /**
     * Tests integer setBitAt method
     */
    @Test
    public void setBitIntegerTest() {
        StringOfBits newString = new StringOfBits("01");
        newString.setBitAt(0, 1);
        assertEquals("11", newString.toString());
        newString.setBitAt(1, 0);
        assertEquals("10", newString.toString());
    }

    /**
     * Tests StringOfBits toString output
     */
    @Test
    public void toStringTest() {
        StringOfBits emptyString = new StringOfBits();
        assertEquals("", emptyString.toString());
        StringOfBits newString = new StringOfBits("011");
        assertEquals("011", newString.toString());
    }
}