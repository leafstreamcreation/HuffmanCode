//HuffmanTreeNodeValuesTest.Java
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 * Tests for HuffmanTreeNodeValues.
 * @author  Derek Noble
 */
public class HuffmanTreeNodeValuesTest {
    /**
     * Tests valid construction for empty HuffmanTreeNodeValues; all fields are null
     */
    @Test
    public void emptyHuffmanTreeNodeValuesTest() {
        HuffmanTreeNodeValues emptyValues = new HuffmanTreeNodeValues();
        assertTrue(emptyValues.getCode() == null);
        assertTrue(emptyValues.getFrequency() == null);
        assertTrue(emptyValues.getSymbol() == null);
    }

    /**
     * Tests valid construction for nonempty HuffmanTreeNodeValues
     */
    @Test
    public void huffmanTreeNodeValuesTest() {
        StringOfBits code = new StringOfBits("011");
        Character symbol = new Character('e');
        Double frequency = new Double(1.5);
        HuffmanTreeNodeValues newValues = new HuffmanTreeNodeValues(symbol, frequency, code);
        assertTrue(newValues.getCode() == code);
        assertTrue(newValues.getFrequency() == frequency);
        assertTrue(newValues.getSymbol() == symbol);
    }

    /**
     * Tests the setCode() method
     */
    @Test
    public void setCodeTest() {
        StringOfBits code = new StringOfBits("011");
        
        HuffmanTreeNodeValues emptyValues = new HuffmanTreeNodeValues();
        emptyValues.setCode(code);
        assertTrue(emptyValues.getCode() == code);
        
        StringOfBits dummy = new StringOfBits("111");
        HuffmanTreeNodeValues newValues = new HuffmanTreeNodeValues('e', 1.5, dummy);
        newValues.setCode(code);
        assertTrue(newValues.getCode() == code);
    }

    /**
     * Tests the setFrequency() method
     */
    @Test
    public void setFrequencyTest() {
        Double frequency = new Double(1.5);
        
        HuffmanTreeNodeValues emptyValues = new HuffmanTreeNodeValues();
        emptyValues.setFrequency(frequency);
        assertTrue(emptyValues.getFrequency() == frequency);
        
        Double dummy = new Double(3.0);
        StringOfBits code = new StringOfBits("011");
        HuffmanTreeNodeValues newValues = new HuffmanTreeNodeValues('e', dummy, code);
        newValues.setFrequency(frequency);
        assertTrue(newValues.getFrequency() == frequency);
    }

    /**
     * Tests the setSymbol() method
     */
    @Test
    public void setSymbolTest() {
        Character symbol = new Character('e');
        
        HuffmanTreeNodeValues emptyValues = new HuffmanTreeNodeValues();
        emptyValues.setSymbol(symbol);
        assertTrue(emptyValues.getSymbol() == symbol);
        
        Character dummy = new Character('f');
        StringOfBits code = new StringOfBits("011");
        HuffmanTreeNodeValues newValues = new HuffmanTreeNodeValues(dummy, 1.5, code);
        newValues.setSymbol(symbol);
        assertTrue(newValues.getSymbol() == symbol);
    }

    /**
     * Tests the toString() method
     */
    @Test
    public void toStringTest() {
        StringOfBits code = new StringOfBits("011");
        Character symbol = new Character('e');
        Double frequency = new Double(1.5);
        HuffmanTreeNodeValues newValues = new HuffmanTreeNodeValues(symbol, frequency, code);
        assertTrue(newValues.toString() == code.toString() + symbol.toString() + frequency.toString());
    }

    /**
     * Tests the getCode() method
     */
    @Test
    public void getCodeTest() {
        StringOfBits code = new StringOfBits("011");
        Character symbol = new Character('e');
        Double frequency = new Double(1.5);
        HuffmanTreeNodeValues newValues = new HuffmanTreeNodeValues(symbol, frequency, code);
        
        StringOfBits newCode = newValues.getCode();
        assertTrue(newCode == code);
    }

    /**
     * Tests the getFrequency() method
     */
    @Test
    public void getFrequencyTest() {
        StringOfBits code = new StringOfBits("011");
        Character symbol = new Character('e');
        Double frequency = new Double(1.5);
        HuffmanTreeNodeValues newValues = new HuffmanTreeNodeValues(symbol, frequency, code);
        
        Double newFrequency = newValues.getFrequency();
        assertTrue(newFrequency == frequency);
    }

    /**
     * Tests the getSymbol() method
     */
    @Test
    public void getSymbolTest() {
        StringOfBits code = new StringOfBits("011");
        Character symbol = new Character('e');
        Double frequency = new Double(1.5);
        HuffmanTreeNodeValues newValues = new HuffmanTreeNodeValues(symbol, frequency, code);
        
        Character newSymbol = newValues.getSymbol();
        assertTrue(newSymbol == symbol);
    }
}