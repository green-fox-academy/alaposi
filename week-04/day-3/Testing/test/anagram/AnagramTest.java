package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  @Test
  public void anagramChecker_True() {
    Anagram anagram = new Anagram();
    assertEquals(true, anagram.anagramChecker("Apple", "Alepp"));
  }

  @Test
  public void anagramChecker_False() {
    Anagram anagram = new Anagram();
    assertEquals(false, anagram.anagramChecker("Apple", "Alp"));
  }
}