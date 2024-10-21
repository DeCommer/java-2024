/// You're out with 3 friends and the bill comes.
/// the bill for dinner is 265.43
/// you have a choice as to the tip percentage, but 18% is most common, os use that.
/// you want to split the tip evenly amongst the group
/// All you have is your laptop, java, and NO INTERNET!
/// Whip up a quick java tip calculator to impress all your friends and save the day!

import java.util.Scanner;

public class TipCalcPractice {
    public static void tipCalc() {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the bill cost? ");
        double billTotal = in.nextDouble();
        System.out.print("How many people in the group? ");
        int groupSize = in.nextInt();
        System.out.print("What is you chosen tip percentage? ");
        double tipPercent = in.nextDouble() / 100;
        double tipAmount = (billTotal * tipPercent);
        double total = billTotal + tipAmount;
        double amountDuePerPerson = (billTotal / groupSize) + (tipAmount / groupSize);
        in.close();
        System.out.println("++++++++++++++++++++++");
        System.out.printf("Bill: $%.2f \n", billTotal);
        System.out.printf("%.2f%% tip, $%.2f \n", tipPercent, tipAmount);
        System.out.printf("Total: $%.2f \n", total);
        System.out.printf("Tip per person $%.2f \n", amountDuePerPerson);
    }

    public static void main(String[] args) {
        tipCalc();
    }
}
