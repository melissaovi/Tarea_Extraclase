package try_catch_throws;

import javax.swing.*;
//unchecked, RunTimeException
public class example1 {
    public static void main(String[] args) {


        try {
            division();
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }catch(NumberFormatException e){
            System.out.println("You can only enter integers numbers "+e.getClass().getName());
        }catch(IllegalArgumentException e ){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finished process");
        }
    }
    static void division(){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("dividend: "));
        int num2= Integer.parseInt(JOptionPane.showInputDialog("divider: "));

        System.out.println("result: "+num1/num2);

    }
}
