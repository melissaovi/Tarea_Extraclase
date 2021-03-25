package try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);


        try {
            int divider, divisor, result;
            System.out.println("divider: ");
            divider = entry.nextInt();

            System.out.println("divisor: ");
            divisor = entry.nextInt();

            result = divider / divisor;
            System.out.println("result: " + result);
        }catch(ArithmeticException e){
            System.out.println("cannot divide by 0");

        }catch(InputMismatchException e){
            System.out.println("only integers numbers");
        }finally {
            System.out.println("Finished process");
        }


    }
}