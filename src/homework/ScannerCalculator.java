package homework;

import java.util.Scanner;

public class ScannerCalculator {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Summation Number");
        int numAdd=input.nextInt();
        System.out.println("Enter Second Summation Number");
        int numAdd2=input.nextInt();
        int totalSum=numAdd+numAdd2;

        System.out.println("Enter First Subtraction Number");
        int numSub=input.nextInt();
        System.out.println("Enter Second Subtraction Number");
        int numSub2=input.nextInt();
        int totalSub=numSub-numSub2;

        System.out.println("Enter First Multiplication Number");
        int numMulti=input.nextInt();
        System.out.println("Enter Second Multiplication Number");
        int numMulti2=input.nextInt();
        int totalMulti=numMulti*numMulti2;

        System.out.println("Enter First Division Number");
        float numDiv=input.nextInt();
        System.out.println("Enter Second Division Number");
        float numDiv2=input.nextInt();
        float totalDiv=numDiv/numDiv2;


        System.out.println("|-----------------------------------------------------------------------------------");
        System.out.println("|--------------------------------CALCULATOR-----------------------------------------");
        System.out.println("|         Type's                      |                 Result                      ");
        System.out.println("|-------------------------------------|---------------------------------------------");
        System.out.println("|         Addition                    |                 "+totalSum+"                ");
        System.out.println("|-------------------------------------|---------------------------------------------");
        System.out.println("|         Subtraction                 |                 "+totalSub+"                ");
        System.out.println("|-------------------------------------|---------------------------------------------");
        System.out.println("|         Multiplication              |                 "+totalMulti+"              ");
        System.out.println("|-------------------------------------|---------------------------------------------");
        System.out.println("|          Division                   |                 "+totalDiv+"                ");
        System.out.println("|-------------------------------------|---------------------------------------------");
        System.out.println("|                        Thank You For Using The Calculator                         ");
        System.out.println("|-----------------------------------------------------------------------------------");
        System.out.println("                                                                       #Tajwar      ");

















//        System.out.println("Total Summation: "+totalSum);
//        System.out.println("Total Subtraction: "+totalSub);
//        System.out.println("Total Multiplication: "+totalMulti);
//        System.out.println("Total Divivsion: "+totalDiv);





    }
}
