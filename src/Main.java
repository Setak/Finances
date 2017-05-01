/**
 * Created by Paul.Kates on 5/1/2017.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        float checkingAcct;
        float savingsAcct;
        float totalAcct;

        DecimalFormat df = new DecimalFormat();  // sets DecimalFormat Class
        df.setMaximumFractionDigits(2);          // makes it so using this format forces 2 places after decimal

        System.out.print("Enter Checking Account Amount: ");
        checkingAcct = userInput.nextFloat();
        System.out.println("You have " + checkingAcct + " in your Checking Account.");

        System.out.print("Enter Savings Account Amount: ");
        savingsAcct = userInput.nextFloat();
        System.out.println("You have " + savingsAcct + " in your Savings Account.");

        System.out.print("\n");
        System.out.print("\n");

        totalAcct = checkingAcct + savingsAcct;
        System.out.println("You have $" + df.format(totalAcct) + " in your accounts.");

    }

}