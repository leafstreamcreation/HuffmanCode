//HuffmanCodeTest.Java
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import org.junit.Test;

import java.util.Map;
import java.util.HashMap;

/**
 * Tests for HuffmanCode.
 * @author  Derek Noble
 */
public class HuffmanCodeTest {
    /**
     * Tests valid construction for a Huffman Code from a hash of symbols to frequencies
     */
    @Test
    public void symbolFrequencyHuffmanCodeTest() {
        HashMap<Character,Double> table1 = new HashMap<Character,Double>();
        table1.put('e', 1.5);
        
        HuffmanCode newCode1 = new HuffmanCode(table1);
        HuffmanCode newCode2 = new HuffmanCode(table1);
        assertTrue(newCode1.getCode() == newCode2.getCode());
        
        HashMap<Character,Double> table2 = new HashMap<>();
        table2.put('f', .5);
        newCode2 = new HuffmanCode(table2);
        assertFalse(newCode1.getCode() == newCode2.getCode());
    }

    /**
     * Tests valid construction for a Huffman Code from a map of symbols to codes
     */
    @Test
    public void symbolCodeHuffmanCodeTest() {
        HashMap<Character,StringOfBits> hmap1 = new HashMap<Character,StringOfBits>();
        HashMap<Character,StringOfBits> hmap2 = new HashMap<Character,StringOfBits>();
        StringOfBits symbolCode1 = new StringOfBits("1110101000101010101");
        StringOfBits symbolCode2 = new StringOfBits("0010101011101010101");
        hmap1.put('e', symbolCode1);
        hmap2.put('e', symbolCode2);
        
        HuffmanCode newCode1 = new HuffmanCode(hmap1);
        HuffmanCode newCode2 = new HuffmanCode(hmap1);
        assertTrue(newCode1.getCode() == newCode2.getCode());
        
        newCode2 = new HuffmanCode(hmap2);
        assertFalse(newCode1.getCode() == newCode2.getCode());
    }

    /**
     * Tests valid construction for a Huffman Code from a seed string
     */
    @Test
    public void stringHuffmanCodeTest() {
        String seed1 = "foo";
        String seed2 = "fubar";
        
        HuffmanCode newCode1 = new HuffmanCode(seed1);
        HuffmanCode newCode2 = new HuffmanCode(seed1);
        assertTrue(newCode1.getCode() == newCode2.getCode());
        
        newCode2 = new HuffmanCode(seed2);
        assertFalse(newCode1.getCode() == newCode2.getCode());
    }

    /**
     * Tests string decoding
     */
    @Test
    public void decodeBitStringTest() {
        String seed = "floccinaucinihilipilification";
        HuffmanCode newCode = new HuffmanCode(seed);
        StringOfBits encoding1 = newCode.encode("float");
        StringOfBits encoding2 = newCode.encode("float");
        assertTrue(newCode.decode(encoding1) == newCode.decode(encoding2));

        encoding2 = newCode.encode("faction");
        assertFalse(newCode.decode(encoding1) == newCode.decode(encoding2));
    }

    /**
     * Tests string encoding
     */
    @Test
    public void encodeToBitStringTest() {
        String seed = "floccinaucinihilipilification";
        HuffmanCode newCode = new HuffmanCode(seed);
        
        StringOfBits encoding1 = newCode.encode("natalia");
        StringOfBits encoding2 = newCode.encode("natalia");
        assertTrue(encoding1 == encoding2);

        encoding2 = newCode.encode("flaunt");
        assertFalse(encoding1 == encoding2);
    }


//Map<Character,StringOfBits> getCode
    /**
     * Tests getCode method
     */
    @Test
    public void getCodeTest() {
        String seed = "floccinaucinihilipilification";
        HuffmanCode newCode1 = new HuffmanCode(seed);
        HuffmanCode newCode2 = new HuffmanCode(newCode1.getCode());
        assertTrue(newCode1.getCode() != null);
        assertTrue(newCode1.getCode() == newCode2.getCode());
    }

}