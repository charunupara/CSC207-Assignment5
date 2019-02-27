package assignment5;

import java.io.PrintWriter;

public class BlockChain {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  Node<Block> first;
  Node<Block> last;
  
  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  
  public BlockChain(int initial) {
    
  } // BlockChain(int initial)
  
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  
  public Block mine(int amount) {
    
  } // mine(int amount)
  
  public int getSize() {
    return this.last.value.getNum();
  } // getSize()
  
  void append(Block blk) throws IllegalArgumentException {
    
  } // append(Block blk)
  
  public boolean removeLast() {
    if (this.last.value.getNum() == 1) {
      return false;
    } // if BlockChain has only one element
    
    not-complete;
    
    return true;
  } // removeLast()
  
  public Hash getHash() {
    return this.last.value.getHash();
  } // getHash()
  
  public boolean isValidBlockChain() {
    
  } // isValidBlockChain()
  
  public void printBalances() {
    PrintWriter pen = new PrintWriter(System.out, true);
    
  } // printBalances()
  
  public String toString() {
    String result = new String("");
    int chainlen = this.last.value.getNum();
    Node<Block> current = this.first;
    for (int i = 0; i < chainlen; i++) {
      result += current.value.toString() + "\n";
      current = current.next;
    } // for
    return result;
  } // toString()
  
} // class BlockChain
