package ExceptionHandling;

public class UserDefinedExceptionClass {
    public static void main(String[] args) {
        try{
            throw new AnException("NewExceptionCreated");
        }catch (AnException e){
            System.out.println(e);
        }
    }
}
