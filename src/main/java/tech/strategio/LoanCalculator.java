package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param ???
     * @return ???
     *
     * LoanCalculator.getRemainingAmountIn3Months(100000))
     * expected:72900
     */
    static int getRemainingAmountIn3Months(int amount) {
        int monthPay = amount;
        int remainder = 0;
        for (int i = 0;i < 3;i++){
            remainder = (int) (monthPay - monthPay * 0.1);
            monthPay = remainder;
        }

        return remainder;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
