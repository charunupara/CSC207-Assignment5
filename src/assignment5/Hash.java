package assignment5;

import java.util.Arrays;

public class Hash {

  // Fields ******************

  byte[] hash;

  // Constructor *********************

  public Hash(byte[] data) {
    this.hash = new byte[data.length];
    for (int i = 0; i < data.length; i++) {
      this.hash[i] = data[i];
    } // for
  } // Hash(byte[] data)

  // Methods *********************

  public byte[] getData() {
    return this.hash;
  } // getData()

  public boolean isValid() {
    return (this.hash[0] == 0) && (this.hash[1] == 0) && (this.hash[2] == 0);
  } // isValid()

  public String toString() {
    String hashStr = "";
    for (int i = 0; i < this.hash.length; i++) {
      String temp = "" + Byte.toUnsignedInt(this.hash[i]);
      hashStr += String.format("%02X", temp);
    } // for
    return hashStr;
  } // String toString()
  // ************************************
  // Other idea: do String.format in return statement after loop

  public boolean equals(Object other) {
    if (other instanceof Hash) {
      Hash otherHash = (Hash) other;
      return Arrays.equals(this.hash, otherHash.getData());
    } // if
    return false;
  } // equals(Object other)
} // class Hash
