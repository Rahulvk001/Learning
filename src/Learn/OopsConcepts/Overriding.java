package Learn.OopsConcepts;

class PersonClass{
    public void display(){
        System.out.println("Person Class");
    }
}
class Student extends PersonClass{
    public void display() {
        System.out.println("I am now a student");
    }
}
class EmpClass extends Student{
    public void display() {
        System.out.println("I am now a Employee");
    }
}
public class Overriding {
    public static void main(String[] args) {
        System.out.println("Test Class");
        PersonClass p = new PersonClass();
        p.display();
        PersonClass s = new PersonClass();
        s.display();
        Student e = new EmpClass();
        e.display();
    }
}
