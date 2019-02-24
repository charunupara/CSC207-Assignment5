package assignment5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Block {

  // Fields
  int blockNum;
  int data;
  Hash prevHash;
  long nonce;
  Hash hash;

  // Constructors
  public Block(int num, int amount, Hash prevHash) {
    this.blockNum = num;
    this.data = amount;
    this.prevHash = prevHash;
    this.nonce = ?;
    this.hash = ?;
  } // Block(int num, int amount, Hash prevHash)

  public Block(int num, int amount, Hash prevHash, long nonce) {
    this.blockNum = num;
    this.data = amount;
    this.prevHash = prevHash;
    this.nonce = nonce;
    this.hash = ?;
  } // Block(int num, int amount, Hash prevHash, long nonce)

  // Methods
  public int getNum() {
    return this.blockNum;
  } // getNum()

  public int getAmount() {
    return this.data;
  } // getAmount()

  public long getNonce() {
    return this.nonce;
  } // getNonce()

  public Hash getPrevHash() {
    return this.prevHash;
  } // getPrevHash()

  public Hash getHash() {
    return this.hash;
  } // getHash()

  public String toString() {
    return "Block " + this.blockNum + " (Amount: " + this.data + ", Nonce: " + this.nonce
        + ", prevHash: " + this.prevHash + ", hash: " + this.hash + ")";
  } // toString()

} // class Block
