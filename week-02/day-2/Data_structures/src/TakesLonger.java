public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String toAdd = "always takes longer than ";
        String before = "you expect";
        quote = addTxt(quote, toAdd, quote.indexOf(before));

        System.out.println(quote);

    }
    public static String addTxt (String str, String strAdded, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, strAdded);
        return sb.toString();
    }

}


// When saving this quote a disk error has occured. Please fix it.
// Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
// Using pieces of the quote variable (instead of just redefining the string)