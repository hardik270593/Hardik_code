package Hardik_code;

import java.util.Scanner;

public class Hardik_work {
    public static void main(String[] args) {
        Scanner H = new Scanner(System.in);// Create a Scanner object


        System.out.println("Enter your age");
        int age = Integer.parseInt(H.nextLine());  // Read user input
        System.out.println("age is: " + age);  // Output user input


        if (age < 10) {
                System.out.println("Enter your user name :");
                String u_name = H.nextLine();
                System.out.println("user name is: " + u_name);
        } else {
                System.out.println("Enter your user name :");
        }



    }
}
