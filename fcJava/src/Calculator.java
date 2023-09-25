import java.util.Arrays;

public class Calculator {

    public static void main(String[] args){

        int a, b, sum;
        a = 1;
        b = 2;
        sum = a + b;

        System.out.println(sum);
        System.out.println("sum = " + sum);
        System.out.println("Calculator.main");
        System.out.println("args = " + Arrays.toString(args));
    }

}
