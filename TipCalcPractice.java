/// You're out with 3 friends and the bill comes.
/// the bill for dinner is 265.43
/// you have a choice as to the tip percentage, but 18% is most common, os use that.
/// you want to split the tip evenly amongst the group
/// All you have is your laptop, java, and NO INTERNET!
/// Whip up a quick java tip calculator to impress all your friends and save the day!
import java.util.Scanner;
public class TipCalcPractice {
    public static void tipCalc() {
        double billTotal;
        double tipPercent;
        double tipAmount;
        double total;
        double amountDuePerPerson;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("What is the bill cost? ");
            billTotal = in.nextDouble();
            System.out.print("How many people in the group? ");
            int groupSize = in.nextInt();
            System.out.print("What is you chosen tip percentage? ");
            tipPercent = in.nextDouble() / 100;
            tipAmount = (billTotal * tipPercent);
            total = billTotal + tipAmount;
            amountDuePerPerson = (billTotal / groupSize) + (tipAmount / groupSize);
        }
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