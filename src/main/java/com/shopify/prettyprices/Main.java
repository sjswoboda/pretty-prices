package com.shopify.prettyprices;

import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        /**
         * TODO: Can you change this so that a user can make multiple attempts, instead of only 1?
         * HINT: A loop! A Boolean! An escape sequence!
         */
        String input;
        Scanner scanner = new Scanner(System.in);

        /**
         * TODO: Prompt the user for an input for this?
         */
        PriceConverter converter = new PriceConverter(new BigDecimal("1.3"));

        System.out.println("Enter amount to convert:" );
        input = scanner.next();

        try {
            BigDecimal value = new BigDecimal(input);
            System.out.println("Converted price: " + converter.convert(value));
        } catch (NumberFormatException ex) {
            /**
             * FIXME: Prompt the user again?
             */
            System.out.println("`" + input + "` is not a valid number. Try again.");
        }
    }
}
