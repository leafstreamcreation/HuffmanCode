/**
 * The class for a Huffman tree node value.
 * <p>
 * The collected values stored at a HuffmanTree node which include:
 * Character symbol, Double frequency, and StringOfBits code.
 * </p>
 *
 * @author Derek Noble Programming Pragmatics (Fall 2016)
 */
public class HuffmanTreeNodeValues {

   /** The symbol for this node. */
   private Character symbol;

   /** The occurrence frequency for this node's symbol. */
   private Double frequency;

   /** The Huffman encoding for this node's symbol. */
   private StringOfBits code;

   /**
     * Constructor that sets all values to null.
     */
   HuffmanTreeNodeValues() {
      this.symbol = null;
      this.frequency = null;
      this.code = null;
   }

   /**
     * Fully parameterized constructor.
     * @param s the symbol.
     * @param f the frequency of the symbol.
     * @param c the code for the symbol.
     */
   HuffmanTreeNodeValues(final Character s,
                         final Double f, final StringOfBits c) {
      this.symbol = new Character(s);
      this.frequency = new Double(f);
      this.code = new StringOfBits(c);
   }

   /**
     * Accesses the code.
     * @return the code
     */
   public StringOfBits getCode() {
      return this.code;
   }

   /**
     * Accesses the frequency.
     * @return the frequency
     */
   public Double getFrequency() {
      return this.frequency;
   }

   /**
     * Accesses the symbol.
     * @return the symbol
     */
   public Character getSymbol() {
      return this.symbol;
   }

   /**
     * Modifies the code.
     * @param newcode the replacement code.
     */
   public void setCode(final StringOfBits newcode) {
      this.code = new StringOfBits(newcode);
   }

   /**
     * Sets a new frequency for this node's symbol.
     * @param newfrequency the replacement frequency.
     */
   public void setFrequency(final Double newfrequency) {
      this.frequency = new Double(newfrequency);
   }

   /**
     * Modifies the symbol.
     * @param newsymbol the new symbol.
     */
   public void setSymbol(final Character newsymbol) {
      this.symbol = new Character(newsymbol);
   }

   /**
     * Returns a String representation for this node.
     * @return this node as a String.
     */
   public String toString() {
      return this.symbol.toString() + this.frequency.toString()
                                    + this.code.toString();
   }
}
