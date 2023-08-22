package class5;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String monthName=scanner.next();
        if (    monthName.equalsIgnoreCase("March")||
                monthName.equalsIgnoreCase("April")||
                monthName.equalsIgnoreCase("May")) {
            System.out.println("season is spring");
        } else if (monthName.equalsIgnoreCase("June") ||
                   monthName.equalsIgnoreCase("July")||
                   monthName.equalsIgnoreCase("August")) {
        {
            System.out.println("season is summer");
        }


    }
}}
