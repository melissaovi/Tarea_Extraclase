package try_catch_throws.Fibonnacci;

public class Fibonnacci {

    public static long fibonnacci(int n)  throws NumberFormatException,IllegalArgumentException{
        if (n<=1)
            return n;
        else return fibonnacci(n-1)+ fibonnacci(n-2);
    }


}