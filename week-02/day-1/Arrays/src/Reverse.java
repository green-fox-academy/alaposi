public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int[] revAj = new int[aj.length];

        for (int i = 0; i < aj.length; i++) {
            revAj[i] = aj[aj.length - 1 - i];
        }
        for (int print : revAj) {
            System.out.println(print);
        }

    }
}


// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`