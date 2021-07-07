package Java_practice.javaI_II_practice;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you.\n", name);

        Scanner scan = new Scanner(System.in);

        //System.out.print("Enter something: ");
        //String userInput = scan.nextLine();

        //System.out.println("You entered: --> \"" + userInput + "\" <--");

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();
//
//
//        boolean confirmation = userInput.equals("y");

        boolean someCondition = false;
        boolean someOtherCondition = true;
        //int x = 4;
        if (someCondition) {
            System.out.println("false");
        } else   {
            System.out.println("True");

        }
    }
}
