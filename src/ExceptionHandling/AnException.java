package ExceptionHandling;

public class AnException extends Throwable {
    String str;
    AnException(String str){
        this.str=str;
    }
    public String toString(){
        return ("Output String = "+str);
    }

}
