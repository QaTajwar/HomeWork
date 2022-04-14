package homework;

import javax.print.DocFlavor;

public class ReturnMethodWithoutParameter {

    public int doSummation(){
        int num1 = 25;
        int num2 = 33;
        int total = num1+num2;
        System.out.println("Total: "+total);
        return total;
    }
    public double doSummation2(){
        double num1 = 78;
        double num2 = 13;
        double total = num1+num2;
        System.out.println("Total: "+total);
        return total;
    }
    public int doMultiplication(){
        int num1=55;
        int num2=36;
        int total=num1*num2;
        System.out.println("Total: "+total);
        return total;
    }
    public double doMultiplication2(){
        double num1=85;
        double num2=4;
        double total=num1+num2;
        System.out.println("Total: "+total);
        return total;

    }
    public int doSubtraction(){
        int num1 =25;
        int num2=10;
        int total=num1-num2;
        System.out.println("Total: "+total);
        return total;
    }
    public String getStudentFullName(){
        String fName="Tajwar";
        String lName="Hamid";
        String fullName=fName+" "+lName;
        System.out.println("FullName is "+fullName);
        return fullName;
    }



    public static void main(String[] args) {
        ReturnMethodWithoutParameter object = new ReturnMethodWithoutParameter();
        object.doSummation();
        object.doSummation2();
        object.doMultiplication();
        object.doMultiplication2();
        object.doSubtraction();
        object.getStudentFullName();
    }
}
