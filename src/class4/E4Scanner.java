package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("please enter your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if(name.equals("Carla")){
            System.out.println("Java instructor");
        }else{
            System.out.println("i don't know you");
        }
    }
}
