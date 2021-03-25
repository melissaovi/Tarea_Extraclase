package cr.ac.tec.own_exceptions.example1;

public class Main {
    public static void main(String[] args) {

        String user,pass,repass;
        user = "meli";
        pass = "12345";
        repass = "12345";

        Helper l = new Helper();

        try{
            l.validatePassword(pass,repass); //aqui se ejecuta el error


        }catch(MyException e){
            System.out.println("No se puede registrar el usuario porque: " + e.getMessage());
        }

    }
}
