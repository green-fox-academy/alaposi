import com.sun.org.apache.xml.internal.utils.res.XResources_zh_CN;

public class Factorio {
    public static void main(String[] args) {
        int input = 5;
        System.out.println(factorio(input));

    }

    public static int factorio(int num) {
        int fact = num;
        for (int i = num-1; i >0 ; i--) {
            fact *= i;
        }
        return fact;
    }


}


//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial