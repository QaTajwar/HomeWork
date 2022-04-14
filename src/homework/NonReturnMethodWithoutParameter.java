package homework;

public class NonReturnMethodWithoutParameter {
    public static void main(String[] args) {
        // non-return without parameter

        NonReturnMethodWithoutParameter math = new NonReturnMethodWithoutParameter();

        math.doSummation();
        math.doSummation2();
        math.doMultiplication();
        math.doDivision();
        math.doDivision2();
        math.doMultiplication2();
        math.doSubtraction();
        math.doSubtraction2();






    }

    public void doSummation() {
        int num1 = 12;
        int num2 = 15;
        int total = num1 + num2;
        System.out.println("Total: "+total);

    }

    public void doSummation2() {
        int num1 = 22;
        int num2 = 35;
        int total = num1 + num2;
        System.out.println("Total: "+total);
    }


    public void doMultiplication() {
        int num1 = 85;
        int num2 = 66;
        int total = num1 * num2;
        System.out.println("Total: "+total);
    }

    public void doMultiplication2() {
        int num1 = 77;
        int num2 = 98;
        int total = num1 * num2;
        System.out.println("Total: "+total);
    }

    public void doSubtraction() {
        int num1 = 683;
        int num2 = 78;
        int total = num1 - num2;
        System.out.println("Total: "+total);
    }

    public void doSubtraction2() {
        int num1 = 983;
        int num2 = 178;
        int total = num1 - num2;
        System.out.println("Total: "+total);
    }

    public void doDivision(){
        int num1=50;
        int num2=5;
        int total=num1/num2;
        System.out.println("Total: "+total);
    }

    public void doDivision2(){
        int num1=8568;
        int num2=4;
        int total =num1/num2;
        System.out.println("Total: "+total);
    }




}
