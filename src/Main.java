/**
 * Created by Paul.Kates on 5/1/2017.
 */
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {                                                                                                     // Opens Main Class

    public static void main(String[] args) throws IOException, FileNotFoundException {                                                                            // Program Begins...

        Scanner userInput = new Scanner(System.in);                                                                     // Create Scanner Object
        Account checkingAcct = new Account();                                                                           // Create checkingAcct object from Account Class
        Account savingsAcct = new Account();                                                                            // Create savingsAcct object from Account Class
        Account totalAcct = new Account();                                                                              // Create totalAcct object from Account Class
        ArrayList<Bills> bill = new ArrayList<Bills>();                                                                 // Create bill ArrayList from Bills Class

        Bills billTotal = new Bills();                                                                                  // Create billTotal object from Bills Class

        int numBills = 0;                                                                                               // Set number of bills to 0, used to test the while loop
        int numBillsItr = 0;                                                                                            // Set number of bills counter in iterator to 0, used to create a count of the iterator
        String moreBills;                                                                                               // initialize moreBills variable, used to create while loop
        String billText;                                                                                                // initialize billText variable, used to determine plurality of text in console output

        DecimalFormat df = new DecimalFormat();                                                                         // Sets df format from DecimalFormat class, used to set min/max digits on floats/doubles
        df.setMinimumFractionDigits(2);                                                                                 // Sets df format to use a minimum 2 places after decimal
        df.setMaximumFractionDigits(2);                                                                                 // Sets df format to use a maximum 2 places after decimal

        /*
        // CODE STARTS HERE TO TEST READ WORKBOOK FUNCTIONALITY

        try {
            HSSFWorkbook workbookRead = new HSSFWorkbook(new FileInputStream("excel.xls"));
            HSSFSheet sheetRead = workbookRead.getSheetAt(0);
            HSSFRow rowRead = sheetRead.getRow(0);
            if (rowRead.getCell(0).getCellTypeEnum() == CellType.STRING) {
                System.out.println(rowRead.getCell(0).getStringCellValue());
            }
        } catch (IOException er) {
            throw new RuntimeException("File was created", er);
        }

        // CODE ENDS HERE TO TEST READ WORKBOOK FUNCTIONALITY
        */

        System.out.print("\n");                                                                                         // Force Line Break in console

        System.out.print("Enter Checking Account Amount: ");                                                            // Asks user for Checking Account Amount
        checkingAcct.setCheckingAcct(userInput.nextFloat());                                                            // Takes user input of next float entered and sets Checking Account variable
        System.out.println("You have $" + df.format(checkingAcct.getCheckingAcct()) + " in your Checking Account.");    // Output to console the amount in Checking Account variable

        System.out.print("Enter Savings Account Amount: ");                                                             // Asks user for Savings Account Amount
        savingsAcct.setSavingsAcct(userInput.nextFloat());                                                              // Takes user input of next float entered and sets Savings Account variable
        System.out.println("You have $" + df.format(savingsAcct.getSavingsAcct()) + " in your Savings Account.");       // Outputs to console the amount in the Savings Account variable

        System.out.print("\n");                                                                                         // Force Line Break in console

        totalAcct.setTotalAcct(checkingAcct.getCheckingAcct() + savingsAcct.getSavingsAcct());                          // Sets the totalAcct variable to add the values returned from the CheckingAcct and SavingsAcct variables entered in the beginning
        System.out.println("You have $" + df.format(totalAcct.getTotalAcct()) + " in your accounts.");                  // Prints out on the console the results of totalAcct, and formatting that value to 2 decimal places

        System.out.print("\n");                                                                                         // Force Line Break in console

        System.out.print("Do you have any bills to add (Y or N): ");                                                    // Asks user if there are any bills to be added
        moreBills = userInput.next();                                                                                   // Takes user input of next string entered and assigns it to the moreBills variable

        System.out.print("\n");                                                                                         // Force Line Break in console

        while (moreBills.equalsIgnoreCase("Y")) {                                                           // Start While loop that looks if moreBills is set to y, if yes enter loop, if not skip

            System.out.print("Enter a bill name here: ");                                                               // Asks user to enter bill name
            String billNameInput = userInput.next();                                                                    // Takes user input of next string entered and assigns it to billNameInput variable, which is part of the Bills class
            System.out.print("Enter how much to pay " + billNameInput + " this month: ");                               // Asks user to enter how much to pay the bill, while displaying the name of the bill entered in billNameInput
            Double billPayInput = userInput.nextDouble();                                                               // Takes user input of next double entered and assigns it to the billPayInput variable, which is part of the Bills class

            Bills billNamePK = new Bills();                                                                             // Creates new billNamePK object from the Bills class
            billNamePK.setBill(billPayInput, billNameInput);                                                            // Sets billNamePK object with the billPayInput and billNameInput variables that the user entered above
            bill.add(billNamePK);                                                                                       // Adds billNamePK object to the Bills ArrayList, creating an entry in the ArrayList with 2 values, bill name (billNameInput) and bill amount (billPayInput)

            //System.out.println("Check Bill Number: " + numBillsWhile);                                                // TEST COMMAND - outputs numBills variable, used to see if the while loop was working properly
            numBills++;                                                                                                 // Increases the numBills variable by 1, this was used as a test variable to check the while loop

            System.out.print("\n");                                                                                     // Force Line Break in console

            System.out.print("Do you have any more bills to add (Y or N): ");                                           // Asks the user if they have any other bills to add
            moreBills = userInput.next();                                                                               // Takes user input of next string entered and assigns it to moreBills variable, if y, repeat while loop, if n exit loop

            System.out.print("\n");                                                                                     // Force Line Break in console

        }                                                                                                               // Closes While Loop for Bill(s) Entry

        //System.out.println("Number of Bills: " + bill.size());

        if (bill.size() > 0) {
            if (bill.size() > 1) {                                                                                          // if statement used to determine the number of bills stored
                billText = "bills";                                                                                         // if number of bills stored is over 1, set the billText variable to use bills (plural)
            } else {                                                                                                        // else, if number of bills stored is 1 or less
                billText = "bill";                                                                                          // if number of bills stored is 1 or less, set the billText variable to use bill (singular)
            }                                                                                                               // end if/else statement
            System.out.println("You have " + bill.size() + " " + billText + " to pay.");                                // Output to console the number of bills to be paid
            System.out.print("\n");
        }


        Iterator itr = bill.iterator();                                                                                 // Creates iterator object and assign the bill ArrayList to it

        while (itr.hasNext()) {                                                                                         // While loop to go through the iterator
            Bills b = (Bills)itr.next();                                                                                // Gets the next object from Bills class and assigns it to b
            System.out.println("You owe $" + df.format(b.getBillExpense()) + " on " + b.getBillName());                 // Prints out to the console this iteration of b, displays the billNameInput, and formatted billPayInput variable to 2 decimal places
            numBillsItr++;                                                                                              // Increases the numBillsItr variable, used to display in console output how many bills are in the iterator
            billTotal.setBillTotal(billTotal.getBillTotal() + b.getBillExpense());                                      // Add billExpense variable from each bill to the billTotal variable, used to display in console output at end of program
        }                                                                                                               // Closes While Loop of the iterator once no more Bills exist

        if (bill.size() == 0) {
            System.out.println("Congratulations! You don't have any bills to pay.");
            totalAcct.setTotalAcct(checkingAcct.getCheckingAcct() + savingsAcct.getSavingsAcct());                      // Sets the totalAcct variable to add the values returned from the CheckingAcct and SavingsAcct variables entered in the beginning
            System.out.println("You have $" + df.format(totalAcct.getTotalAcct()) + " in your accounts.");              // Prints out on the console the results of totalAcct, and formatting that value to 2 decimal places

        } else {
            checkingAcct.setCheckingAcct(checkingAcct.getCheckingAcct() - billTotal.getBillTotal());
            System.out.print("\n");
            if (checkingAcct.getCheckingAcct() <= 0) {
                System.out.println("You don't have enough in your checking account!");

                System.out.print("\n");

                if (Math.abs(checkingAcct.getCheckingAcct()) <= savingsAcct.getSavingsAcct()) {
                    System.out.println("You should transfer $" + df.format(Math.abs(checkingAcct.getCheckingAcct())) + " from your savings account.");

                    System.out.print("\n");

                    savingsAcct.setSavingsAcct(savingsAcct.getSavingsAcct() - Math.abs(checkingAcct.getCheckingAcct()));
                    System.out.println("Leaving you with $" + df.format(savingsAcct.getSavingsAcct()) + " in your savings account.");
                } else {
                    System.out.println("You don't have enough money in either account to pay your bills.");
                }
            } else {
                System.out.println("You will have $" + df.format(checkingAcct.getCheckingAcct()) + " in your checking account.");
                System.out.println("You will have $" + df.format(savingsAcct.getSavingsAcct()) + " in your savings account.");

                System.out.print("\n");

                totalAcct.setTotalAcct(checkingAcct.getCheckingAcct() + savingsAcct.getSavingsAcct());                          // Sets the totalAcct variable to add the values returned from the CheckingAcct and SavingsAcct variables entered in the beginning
                System.out.println("Giving you a total of $" + df.format(totalAcct.getTotalAcct()) + " in your accounts.");              // Prints out on the console the results of totalAcct, and formatting that value to 2 decimal places
            }
        }

        System.out.print("\n");

        System.out.println("I hope this helped. Enter X to exit: ");
        String exit = userInput.next();

        while (!exit.equalsIgnoreCase("x")) {
            System.out.println("Hahahaha, not X, try again.");
            exit = userInput.next();
        }

        //System.out.print("\n");                                                                                       // Force Line Break in console

        //System.out.println("For a total of $" + df.format(billTotal.getBillTotal()));                                 // Output to console the total of the bills stored, formatted to 2 places after decimal

    }                                                                                                                   // ...Program Ends

}                                                                                                                       // Closes Main Class