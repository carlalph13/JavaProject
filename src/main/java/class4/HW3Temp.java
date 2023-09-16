package class4;

import java.util.Scanner;

public class HW3Temp {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input your city");
        String city= scanner.next();
        System.out.println("Please enter temperature");
        double temperature=scanner.nextDouble();
        double celsius= (temperature-32)*5/9;
        System.out.println("The temperature in " +city+ " is " +celsius+"°c");






    }
}
