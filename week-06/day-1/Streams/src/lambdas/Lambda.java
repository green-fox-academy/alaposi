package lambdas;

public class Lambda {
  public static void main(String[] args) {

    // Create a lambda that takes two integer parameters and returns their sum
    //                                (argument list)   arrow token     { body of lambda}
    //(int a, int b) -> a + b;

    // Store it in a variable // what type of variable can we use?
    TwoIntegerProcessor sumFunction = (int a, int b) -> a + b;

    // How can we simplify it and why?
    TwoIntegerProcessor sumFunction2 = (a, b) -> a + b;

    // Pass it to a method that executes this logic and displays calculation result
    displayCalculationResults(10, 10, sumFunction2 );

    // Make it without creating a new variable
    displayCalculationResults(10, 18, (int a, int b) -> a + b);

    // Use method references:
    // <later>

    // Make it with multiplication instead
    displayCalculationResults(10, 18, (int a, int b) -> a * b);

  }

  private static void displayCalculationResults(int a, int b, TwoIntegerProcessor processor) {
    int result = processor.calculate(a,b);
    System.out.println(result);
  }

//  private static int sum(int a, int b) {
//    return a + b;
//  }
}
