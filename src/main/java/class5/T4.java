package class5;

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();
        if(number>=1 && number <= 10) {
            System.out.println("small");
        } else if (number >= 11 && number <=100) {

        } else if (number >= 101 && number <= 1000) {
            System.out.println("large");
        }



    }
}
