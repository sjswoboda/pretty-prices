package com.shopify.prettyprices;

import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        /**
         * TODO: Can you change this so that a user can make multiple attempts, instead of only 1?
         * HINT: A loop! A boolean! An escape sequence!
         */
        String input;
        Scanner scanner = new Scanner(System.in);
        PriceConverter converter = new PriceConverter();

        System.out.println("Enter amount to convert:" );
        input = scanner.next();

        try {
            BigDecimal value = new BigDecimal(input);
            System.out.println("Converted price: " + converter.convert(value));
        } catch (NumberFormatException ex) {
            /** 
             * FIXME: Without too much code duplication, what's the best way to prompt the user again?
             */
            System.out.println("`" + input + "` is not a valid number. Try again.");
        }
    }
}
