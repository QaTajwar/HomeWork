package homework;

public class ConstructorCalculator {

    int num1;
    int num2;
    int total;


    ConstructorCalculator(int num1, int num2)

    {

        this.num1=num1;

        this.num2=num2;

        this.total=this.num1+this.num2;

        System.out.println(this.total);

    }



    public static void main(String[] args) {
        ConstructorCalculator hi = new ConstructorCalculator(20, 65  );





    }



}
