package com.sraynitjsr.ifelse;

public class MyConditionalStatements {
    public static void start() {
    	System.out.println("Conditional Statements in Java");
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("a is less than b");
        }

        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is not greater than b");
        }

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than b");
        }

        if (a > 5) {
            if (b > 15) {
                System.out.println("a is greater than 5 and b is greater than 15");
            } else {
                System.out.println("a is greater than 5 but b is not greater than 15");
            }
        } else {
            System.out.println("a is not greater than 5");
        }

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        int max = (a > b) ? a : b;
        System.out.println("The larger number between a and b is: " + max);

        boolean isAdult = true;
        boolean hasLicense = false;
        if (isAdult && hasLicense) {
            System.out.println("You can drive.");
        } else {
            System.out.println("You cannot drive.");
        }

        if (isAdult || hasLicense) {
            System.out.println("At least one condition is true.");
        }

        if (!hasLicense) {
            System.out.println("You do not have a driving license.");
        }
    }
}
