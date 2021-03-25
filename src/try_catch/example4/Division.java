package try_catch.example4;

public class Division {
    
    private int divider,divisor;

    public Division(){}

    public Division(String a,String b ) throws NumberFormatException{
        divider =Integer.parseInt(a);
        divisor =Integer.parseInt(b);
    }
    public String dividir() throws ArithmeticException{
        int result;
        if(divisor ==1){
            throw new ExceptionDivisor("divide by one is not allowed");
        }else{
            result = divider/divisor;
        }
        return Integer.toString(result);

    }
}
