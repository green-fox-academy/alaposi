public class Summing {
    public static void main(String[] args) {
        int input = 10;
        System.out.println(summing(input));

    }

    public static int summing(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}


// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero
// to the given parameter