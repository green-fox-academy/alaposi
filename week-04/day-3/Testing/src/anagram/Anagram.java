package anagram;

import java.util.Arrays;

public class Anagram {

  public boolean anagramChecker(String word1, String word2) {
    boolean isAnagram = false;
    if (word1.length() != word2.length()) {
      return isAnagram;
    } else {
      char[] ArrayWord1 = word1.toLowerCase().toCharArray();
      char[] ArrayWord2 = word2.toLowerCase().toCharArray();

      Arrays.sort(ArrayWord1);
      Arrays.sort(ArrayWord2);

      int counter = 0;
      for (int i = 0; i < ArrayWord1.length; i++) {
        if (ArrayWord1[i] == ArrayWord2[i]) {
          counter += 1;
        }
      }
      if (counter == ArrayWord1.length) {
        isAnagram = true;
      }
      return isAnagram;
    }
  }
}

