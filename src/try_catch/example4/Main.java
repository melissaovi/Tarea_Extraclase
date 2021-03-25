package try_catch.example4;

public class Main{
    public static void main(String[] args) {

        Division division = new Division(6,2);

        try{
            division.dividir();
        }catch(ExceptionDivisor e){
            System.out.println("Cannot divide by 1");
        }catch( ArithmeticException e){
            System.out.println("aritmeticExp"+e.getMessage());

        }catch(NumberFormatException e ){
            System.out.println("number format exception"+e.getMessage());
        }

    }



}
