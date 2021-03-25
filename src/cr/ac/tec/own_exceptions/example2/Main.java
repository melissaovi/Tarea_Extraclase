package cr.ac.tec.own_exceptions.example2;


import javax.swing.*;




//try and catch because is checked
public class Main {
    public static void main(String[] args){

        String email = JOptionPane.showInputDialog("Email: ");



        try {
        validate_email(email);

        }catch(Exception e){
            System.out.println("The mail is very short");
            e.printStackTrace();
        }

    }
    static void validate_email(String mail) throws MyException  {
        boolean arroba = false;

        boolean dot = false;


        if (mail.length()<=2){
            throw new MyException("the mail cannot be less than two charactersmm,,"); // throw, throw a bug manually


        }else {

            for (int i = 0; i < mail.length(); i++) {
                if (mail.charAt(i) == '@') {
                    arroba = true;
                }
                if (mail.charAt(i) == '.') {
                    dot = true;
                }
            }
            if (arroba == true && dot == true) {
                System.out.println("the email is well written");
            } else {
                System.out.println("the email isn't well written,write it again");
            }
        }
    }

}


