package class4;

import java.util.Scanner;

public class HW5Salary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of years worked");
        double years = input.nextDouble();
        System.out.println("Enter annual salary");
        double salary = input.nextDouble();

        if (years >= 5) {
            System.out.println("User eligible for bonus");
        if (salary>50000){
            System.out.println("bonus is 5,000");
        } else {
            System.out.println("bonus is 3,000");
        }
        } else
            System.out.println("Not eligible for bonus");



}}
