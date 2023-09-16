package class4;

import java.util.Scanner;

public class HW4CreditCard {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card");
        String answer= input.next();
        if (answer.equals("No")) {
            System.out.println("Credit card offer");
        } else {
            System.out.println("what is your balance");
            int balance=input.nextInt();
            if (balance>1000) {
                System.out.println("pay off your balance");
            } else {
                System.out.println("you can spend more");
            }

    }
}}
