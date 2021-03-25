package cr.ac.tec.own_exceptions.example2;

public class MyException extends Exception {

        public MyException(){  //good practice
                                //empty method and one with String

        }
        public MyException(String msg){
            super(msg);
        }
}
