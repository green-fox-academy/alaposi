package apples;

import org.junit.Assert;
import org.junit.Test;

public class AppleTest {

  @Test
  public void getApple() {
    Apple apple = new Apple();
    Assert.assertEquals("apple", apple.getApple());
  }

  @Test
  public void getApple_false() {
    Apple apple = new Apple();
    Assert.assertEquals("pear", apple.getApple());
  }
}