package Learn;
class PersonMethod{
    String name = "Rahul";
    public void display(){
        System.out.println("This is super class");
    }
    public PersonMethod(){

    }

    public PersonMethod(int a) {
        System.out.println("Parameterized ");
    }
}
public class SuperExample2 extends PersonMethod  {
    String name = "Ananthu";

    public void display(){
        System.out.println("Super class Name:" + super.name);
        System.out.println("Sub class Name:" + name);

    }
    public void finaldisplay (){
        super.display();
    }

    public static void main(String[] args) {
        SuperExample2 a = new SuperExample2();
        a.display();
        a.finaldisplay();
        PersonMethod ob = new PersonMethod(1);
    }



}