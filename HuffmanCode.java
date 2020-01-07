import java.util.Map;
import java.util.HashMap;
/**
 * The class for a Huffman code object.
 * <p>
 * Implementation of Huffman coding.
 * An instance of stores a code used for subsequent
 * encoding and decoding of strings.
 * </p>
 *
 * @author Derek Noble Programming Pragmatics (Fall 2016)
 */
public class HuffmanCode {

   HuffmanCode(final HashMap<Character,Double> table) {
   //Creates a Huffman code for a given frequency table
   }

   HuffmanCode(final Map<Character, final StringOfBits> hmap) {
   //Creates a Huffman code for a given mapping of symbols to codes
   }

   HuffmanCode(final String seed) {
   //Creates a Huffman code for a given seed string
   }

   public String decode(final StringOfBits encodedString) {
   //decodes a bit string using the Huffman code of this object
      return "DEADBEEF";
   }

   public StringOfBits encode(final String inputString) {
   //encodes a string using the Huffman code of this object
      return new StringOfBits("101010101101010101");
   }

   public Map<Character, StringOfBits> getCode() {
   //returns the mapping of symbols to codes for this object
      return null;
   }
}