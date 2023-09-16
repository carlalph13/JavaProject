package groupExercise1;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int primeNum= scanner.nextInt();

        if(primeNum %2!=0){
            System.out.println("This is a prime number");

        }else{
            System.out.println("This is not a prime number");
        }
}}
