package homework;

public class NonReturnMethodWithParameter {
    //non-return with parameter

    public void doSummation(int num1, int num2){
        int total = num1+num2;
        System.out.println("Total: "+total);
    }
    public void doSummation2(double num1, double num2){
        double total = num1+num2;
        System.out.println("Total: "+total);
    }

    public void doSubtraction(int num1,int num2){
        int total = num1-num2;
        System.out.println("Total: "+total);
    }
    public void doSubtraction2(double num1,double num2){
        double total = num1-num2;
        System.out.println("Total: "+total);
    }
    public void doMultiplication(int num1,int num2){
        int total = num1*num2;
        System.out.println("Total: "+total);
    }
    public void doMultiplication2(double num1,double num2){
        double total = num1*num2;
        System.out.println("Total: "+total);
    }
    public void doDivision(int num1,int num2){
        int total = num1/num2;
        System.out.println("Total: "+total);
    }
    public void getStudentName(String fName,String lName){
        String fullName= fName+" "+lName;
        System.out.println("FullName is "+fullName);
    }




    public static void main(String[] args) {
        NonReturnMethodWithParameter object = new NonReturnMethodWithParameter();

        object.doSummation(10,68);
        object.doMultiplication(85,74);
        object.doSubtraction(12,5);
        object.doDivision(25,5);
        object.getStudentName("Tajwar","Hamid");





    }
}
