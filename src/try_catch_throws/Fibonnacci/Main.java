package try_catch_throws.Fibonnacci;


public class Main extends Fibonnacci {
    public static void main(String[] args) {
        int num;
        long f1;
        String n;
        try {
            n = javax.swing.JOptionPane.showInputDialog("Number");
            num = Integer.parseInt(n);
            f1 = fibonnacci(num);
            javax.swing.JOptionPane.showMessageDialog(null, "the fibonacci number is: " + f1);
        }catch(NumberFormatException e){
            System.out.println("invalid entry,try again");
            e.printStackTrace();
        }catch(IllegalArgumentException e ){
            System.out.println("invalid entry,try again");
            e.printStackTrace();

        }finally {
            System.out.println("Finished process");
        }
    }
}
