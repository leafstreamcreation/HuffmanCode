/**
 * StringOfBits class
 * <p>
 * Represents a string of bit values (0 or 1).
 * </p>
 *
 * @author Derek Noble Programming Pragmatics (Fall 2016)
 */

public class StringOfBits {

   /** The bit string. */
   private String bits;

   /**
     * Constructs the empty bit string; length() == 0.
     */
   StringOfBits() {
      this.bits = "";
   }

   /**
     * Constructs a bit string from a sequence of '0' and '1' characters.
     * If the parameter is not comprised of '0' and '1' characters the
     * behavior is undefined.
     * @param chars the sequence to convert into bits
     */
   StringOfBits(final CharSequence chars) {
      this.bits = new String(chars.toString());
   }

   /**
     * Copy constructor.
     * @param sb the object to be cloned.
     */
   StringOfBits(final StringOfBits sb) {
      this.bits = new String(sb.toString());
   }

   /**
     * Appends the bit string representation of the parameter to this bit
     * string; false corresponds to 0, true corresponds to 1.
     * @return a reference to this bit string.
     * @param b the bit to append.
     */
   public StringOfBits append(final boolean b) {
      if (b) {
         this.bits = this.bits + "1";
      } else {
         this.bits = this.bits + "0";
      }
      return this;
   }

   /**
     * Appends the bit string representation of the parameter to this bit
     * string. If the parameter is not '0' or '1' the behavior of this
     * method is undefined.
     * @return a reference to this bit string.
     * @param c the bit to append; must have value '0' or '1'.
     */
   public StringOfBits append(final char c) {
      if (c == '0') {
         this.bits = this.bits + "0";
      } else if (c == '1') {
         this.bits = this.bits + "1";
      }
      return this;
   }

   /**
     * Appends the bit string representation of the parameter to this bit
     * string. Each substring of "0" corresponds to 0; each "1" corresponds
     * to 1. If the string contains other than "0" and "1" the behavior of
     * this method is undefined.
     * @return a reference to this bit string.
     * @param str a string.
     */
   public StringOfBits append(final CharSequence str) {
      for (char c: str.toString().toCharArray()) {
         if (c != '0' && c != '1') {
            return this;
         }
      }
      this.bits = this.bits + str.toString();
      return this;
   }

   /**
     * Appends the bit string representation of the parameter to this bit
     * string. Each digit represents a single bit. If any digit of the
     * parameter is not 0 or 1 the behavior is undefined.
     * @return a reference to this bit string.
     * @param i an integer representation of a bit sequence.
     */
   public StringOfBits append(final int i) {
      switch (i) {
         case 0: this.bits = this.bits + "0";
                 break;
         case 1: this.bits = this.bits + "1";
                 break;
         default:
      }
      return this;
   }

   /**
     * Appends a StringOf Bits to this StringOfBits.
     * @return a reference to this bit string.
     * @param bitstr the StringOfBits appended.
     */
   public StringOfBits append(final StringOfBits bitstr) {
      this.bits = this.bits + bitstr.toString();
      return this;
   }

   /**
     * Returns a boolean corresponding to the bit at the specified index.
     * @return the boolean value at the specified index (0 == false; 1 == true).
     * @throws java.lang.IndexOutOfBoundsException if index is negative
     * or greater than or equal to length().
     * @param index the index of the desired bit value.
     */
   public boolean booleanAt(final int index) {
      if (index < 0 || index >= this.length()) {
         throw new IndexOutOfBoundsException();
      } else if (this.bits.toCharArray()[index] == '0') {
         return false;
      }
      return true;
   }

   /**
     * Returns a char corresponding to the bit at the specified index.
     * @return the char value at the specified index.
     * @throws java.lang.IndexOutOfBoundsException if index is negative
     * or greater than or equal to length().
     * @param index the index of the desired bit value.
     */
   public char charAt(final int index) {
      if (index < 0 || index >= this.length()) {
         throw new IndexOutOfBoundsException();
      }
      return this.bits.toCharArray()[index];
   }

   /**
     * Returns an int corresponding to the bit at the specified index.
     * @return an int value corresponding to specified index (0 == 0; 1 == 1).
     * @throws java.lang.IndexOutOfBoundsException if index is negative
     * or greater than or equal to length().
     * @param index the index of the desired bit value.
     */
   public int intAt(final int index) {
      if (index < 0 || index >= this.length()) {
         throw new IndexOutOfBoundsException();
      }
      char element = this.bits.toCharArray()[index];
      if (element == '0') {
         return 0;
      } else {
         return 1;
      }
   }

   /**
     * Returns the length of this bit string.
     * @return the number of bits in this string.
     */
   public int length() {
      return this.bits.length();
   }

   /**
     * Sets the bit at the specified index.
     * @param index the index to modify.
     * @param b the boolean value to set the bit as.
     */
   public void setBitAt(final int index, final boolean b) {
      if (index > -1 && index < this.length()) {
         char[] bitsArray = this.bits.toCharArray();
         if (b) {
            bitsArray[index] = '1';
         } else {
            bitsArray[index] = '0';
         }
         this.bits = new String(bitsArray);
      }
   }

   /**
     * Sets the bit at the specified index.
     * @param index the index to modify.
     * @param c the character value to set the bit as.
     */
   public void setBitAt(final int index, final char c) {
      if (index > -1 && index < this.length()) {
         if (c == '0' || c == '1') {
            char[] bitsArray = this.bits.toCharArray();
            bitsArray[index] = c;
            this.bits = new String(bitsArray);
         }
      }
   }

   /**
     * Sets the bit at the specified index.
     * @param index the index to modify.
     * @param i the integer value to set the bit as
     */
   public void setBitAt(final int index, final int i) {
      if (index > -1 && index < this.length()) {
         char[] bitsArray = this.bits.toCharArray();
         switch (i) {
            case 0: bitsArray[index] = '0';
                    this.bits = new String(bitsArray);
                    break;
            case 1: bitsArray[index] = '1';
                    this.bits = new String(bitsArray);
                    break;
            default:
         }
      }
   }

   /**
     * Gives a String representation of this StringOfBits.
     * @return this StringOfBits as a String.
     */
   public String toString() {
      return this.bits;
   }
}
