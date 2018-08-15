package Learn;
class Person{
    String name = "Parent class";

}

public class SuperExample1 extends Person {
    String  name = "Child class";

    public void display(){
        System.out.println("Super class Name:" + super.name);
        System.out.println("Sub class Name:" + name);

}

    public static void main(String[] args) {
        SuperExample1 a = new SuperExample1();
        a.display();
    }
}
