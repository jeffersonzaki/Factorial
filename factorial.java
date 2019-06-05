import javax.swing.*;
import java.math.BigInteger;

// e.g. 5! = 5 * 4 * 3 * 2 * 1 = 120
public class factorial {
    public static String output = "";
    private static String result;

    public static BigInteger computefactorial(int n) {
        BigInteger result = BigInteger.ONE;
                while(n>0) {
                    result = result.multiply(new BigInteger(n + ""));
                    n = n - 1; 
                }
                return result;
    }


    // * Main Method * //
        public static void main (String[]args) {
            while (true) {
                int num = Integer.parseInt(JOptionPane.showInputDialog("\nEnter an Integer Number e.g. 7"));

                output += "\nThe Factorial of " + num + " = " + result;
                JOptionPane.showMessageDialog(null, output);
            }
        }
    }
