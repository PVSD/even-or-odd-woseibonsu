package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner kbinput = new Scanner(System.in);

        while(!kbinput.hasNextInt())
        {
            System.out.println("Please enter an integer. Ex: 12, 7, 3");
            kbinput = new Scanner(System.in);
        }
        
        int userIn = kbinput.nextInt();
        int oddOrEven = userIn % 2;

        if(oddOrEven == 0)
        {
            System.out.println("The integer " + userIn + " is even." );
        }
        else
        {
            System.out.println("The integer " + userIn + " is odd.");
        }





    }
}
