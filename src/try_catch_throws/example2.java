package try_catch_throws;
import javax.swing.*;
import java.util.Scanner;
import java.util.InputMismatchException;

//checked
public class example2 {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.println("Choose an option: \n1:Square \n2:Rectangle \n3:Triangle");
        int figure = 0;

        try {
            figure= entry.nextInt();
        }catch(InputMismatchException e){
            System.out.println("invalid entry,choose 1,2 or 3");

        } finally {
            entry.close();

        }



        try {
            switch (figure) {
                case 1:
                    int side = Integer.parseInt(JOptionPane.showInputDialog("side: "));
                    System.out.println("area of the square " + Math.pow(side, 2));
                    break;
                case 2:
                    int base = Integer.parseInt(JOptionPane.showInputDialog("base: "));
                    int height = Integer.parseInt(JOptionPane.showInputDialog("height: "));
                    System.out.println("area of the rectangle: " + base * height);
                    break;

                case 3:
                    int base2 = Integer.parseInt(JOptionPane.showInputDialog("base: "));
                    int height2 = Integer.parseInt(JOptionPane.showInputDialog("height: "));
                    System.out.println("area of the triangle: " + (base2 * height2) / 2);
                    break;
                default:
                    System.out.println("the opcion isn't correct");
            }
        }catch (NumberFormatException e) {
            System.out.println("only integers numbers are allowed " + e.getMessage());
        } finally{
            System.out.println("Finish first part");
        }

     //second part,it runs even if the first part fails
        try {
            int height = Integer.parseInt(JOptionPane.showInputDialog("height in cm : "));
            System.out.println("ideal weight for mens : " + (height / 2) + "kg");
            System.out.println("ideal weight for women is : " + (height / 3) + "kg");
        }catch(Exception e ){
            System.out.println("Invalid entry "+e.getMessage());
        }finally{
            System.out.println("Second part finished");
        }

    }

}