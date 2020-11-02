import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
  public static void main(String[] args) {
    new Main();
  }

  int tableLength = 10;

  public Main() {
    // 1-123-456-7890
    // 1,234,567,890
    /// int[] array = new int[1_234_567_890];
    // System.out.println(array.length);
    long[] hashTable = new long[tableLength];
    Arrays.fill(hashTable, -1);

    long[] phoneNumbers = { 402_554_1234L, 402_554_9999L };
    for (int i = 0; i < phoneNumbers.length; i++) {
      long phoneNumber = phoneNumbers[i];
      int hash = hashPhoneNumber(phoneNumber);
      hashTable[hash] = phoneNumber;
    }

    // Print hash table
    for (int i = 0; i < hashTable.length; i++) {
      long hashTableEntry = hashTable[i];
      System.out.println("Hash entry for index " + i);
      System.out.println(" " + hashTableEntry);
    }
  }

  private int hashPhoneNumber(long phoneNumber) {
    return (int) (phoneNumber % tableLength);
  }
}
