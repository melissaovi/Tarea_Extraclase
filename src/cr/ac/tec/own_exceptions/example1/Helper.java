package cr.ac.tec.own_exceptions.example1;

public class Helper {
    Helper(){

    }
    public void validatePassword(String pass,String repass) throws MyException{
        if(!pass.equals(repass)){
            throw new MyException("Password does not match"); //se tira la excepcion hacia MyException

        }
        if(pass.length()<8){
            throw new MyException("The password isn't long enough");
        }

    }

}
