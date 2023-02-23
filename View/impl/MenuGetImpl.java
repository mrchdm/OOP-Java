package View.impl;

import View.MenuGet;

import java.util.Scanner;

/**
 * The class contains get-methods from the console
 */
public class MenuGetImpl implements MenuGet {
    /**
     * Method get String value from input
     *
     * @return String
     */
    @Override
    public String getInputValue() {
        System.out.print("Enter the action: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    /**
     * Method get two values from input for expression
     *
     * @return array of two number
     */
    @Override
    public Number[] getValuesForExpression() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String input1 = scanner.next();
        System.out.print("Enter the second number: ");
        String input2 = scanner.next();
        Number num1 = null;
        Number num2 = null;
        try {
            num1 = Double.parseDouble(input1);
            num2 = Double.parseDouble(input2);
        } catch (NumberFormatException e) {
            try {
                num1 = Integer.parseInt(input1);
                num2 = Integer.parseInt(input2);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input, please enter a valid number.");
            }
        }
        return new Number[]{num1, num2};
    }
}