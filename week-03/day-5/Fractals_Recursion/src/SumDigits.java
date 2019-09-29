public class SumDigits {
  public static void main(String[] args) {

    int number = 2301419;
    System.out.println(sumDigits(number));

  }

  public static int sumDigits(int number) {
    int sum = 0;
    int lastDigit = number % 10;
    int remaining = number / 10;

    if (number == 0) {
      return 0;
    } else {
      sum = lastDigit + sumDigits(remaining);
      return sum;
    }
  }
}


//  Sum Digits
//  Given a non-negative integer n, return the sum of its digits recursively (without loops).
//
//    Hint
//    Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
//    Java, C++, C#, Python
//    Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
//
//    JavaScript, TypeScript
//    There is no integer type in JavaScript. To remove the rightmost digit you must divide (/)
//    the number by 10 and find a way to get the the whole number portion of that number.
