package homework;

import java.util.Scanner;

public class ScannerNew {


    public void doSummation(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        int total = num1+num2;
        System.out.println("Total Summation : "+total);

    }
    public void doSubtraction(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        int total = num1-num2;
        System.out.println("Total Subtraction : "+total);

    }

    public static void main(String[] args) {
        ScannerNew hi = new ScannerNew();
        hi.doSummation();
        hi.doSubtraction();


    }
}
