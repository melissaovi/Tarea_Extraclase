package try_catch.example4;

public class ExceptionDivisor extends RuntimeException{

    public ExceptionDivisor(){
        this("action not allowed,dont divide by 1");

    }
    public ExceptionDivisor(String args){
        super(args+"Divide by 1");
    }
}
