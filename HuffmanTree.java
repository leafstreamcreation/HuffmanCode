/**
 * HuffmanTree class
 * <p>
 * A HuffmanTree is a specialized BinaryTree used for developing
 * and storing a Huffman Code. Note that there is no empty tree
 * constructor.
 * </p>
 *
 * @author Derek Noble Programming Pragmatics (Fall 2016)
 */

public class HuffmanTree extends BinaryTree<HuffmanTreeNodeValues> {

   /**
    * Serialization version indicator used to determine
    *    if a file is compatible with this class.
    */
   private static final long serialVersionUID = 2016090422L;

   /**
    * Root value for this tree.
    */
   private HuffmanTreeNodeValues rootValue;

   /**
    * Left child of this tree.
    */
   private HuffmanTree leftChild;

   /**
    * Right child of this tree.
    */
   private HuffmanTree rightChild;

   /**
    * Maximum difference to accept two double values as equal.
    */
   private static final double EPSILON = 5.0E-6;

   /**
     * Parameterized constructor for leaf node.
     * @param symbol the symbol stored in this node
     * @param frequency the frequency stored in this node
     * @param code the code stored in this node
     */
   public HuffmanTree(final Character symbol,
                      final Double frequency,
                      final StringOfBits code) {
      this.rootValue = new HuffmanTreeNodeValues(symbol, frequency, code);
      this.leftChild = null;
      this.rightChild = null;
   }

   /**
     * Fully parameterized constructor.
     * @param symbol the symbol stored in this node
     * @param frequency the frequency stored in this node
     * @param code the code stored in this node
     * @param lChild the left child for this node
     * @param rChild the right child for this node
     */
   public HuffmanTree(final Character symbol,
                      final Double frequency,
                      final StringOfBits code,
                      final HuffmanTree lChild,
                      final HuffmanTree rChild) {
      this.rootValue = new HuffmanTreeNodeValues(symbol, frequency, code);
      this.leftChild = lChild;
      this.rightChild = rChild;
   }

   /**
     * Constructor for internal node.
     * @param data an object containing the symbol, frequency,
     * and code for this node.
     * @param lChild the left child for this node
     * @param rChild the right child for this node
     */
   public HuffmanTree(final HuffmanTreeNodeValues data,
                      final HuffmanTree lChild,
                      final HuffmanTree rChild) {
      this.rootValue = new HuffmanTreeNodeValues(data.getSymbol(),
                                                 data.getFrequency(),
                                                 data.getCode());
      this.leftChild = lChild;
      this.rightChild = rChild;
   }

   /**
     * Constructor for leaf node.
     * @param data an object containing the symbol, frequency,
     * and code for this node.
     */
   public HuffmanTree(final HuffmanTreeNodeValues data) {
      this.rootValue = new HuffmanTreeNodeValues(data.getSymbol(),
                                                 data.getFrequency(),
                                                 data.getCode());
      this.leftChild = null;
      this.rightChild = null;
   }

//int compareTo(HuffmanTree ht)
//comparison to parameter for order

//boolean equals(Object o)
//considers the symbol and the frequency only

   /**
     * Accesses the code.
     * @return the code
     */
   public StringOfBits getCode() {
      return this.rootValue.getCode();
   }

   /**
     * Accesses the frequency.
     * @return the frequency
     */
   public Double getFrequency() {
      return this.rootValue.getFrequency();
   }

   /**
     * Accesses the left child.
     * @return the left child
     */
   public HuffmanTree getLeftChild() {
      return this.leftChild;
   }

   /**
     * Accesses the right child.
     * @return the right child
     */
   public HuffmanTree getRightChild() {
      return this.rightChild;
   }

   /**
     * Accesses the symbol.
     * @return the symbol
     */
   public Character getSymbol() {
      return this.rootValue.getSymbol();
   }

//int hashCode()
   /**
     * Returns a hash code value for the object.
     * a hash code value for this object.
     * @return the symbol
     */
   public int hashCode() {
      return rootValue.hashCode() + 1;
   }

   /**
     * Modifies the code.
     * @param newcode the replacement code.
     */
   public void setCode(final StringOfBits newcode) {
      this.rootValue.setCode(newcode);
   }

   /**
     * Modifies the frequency.
     * @param newfrequency the replacement frequency.
     */
   public void setFrequency(final Double newfrequency) {
      this.rootValue.setFrequency(newfrequency);
   }

   /**
     * Modifies the symbol.
     * @param newsymbol the new symbol.
     */
   public void setSymbol(final Character newsymbol) {
      this.rootValue.setSymbol(newsymbol);
   }
}
