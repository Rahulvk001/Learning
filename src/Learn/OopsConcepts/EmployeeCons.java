package Learn.OopsConcepts;

class PersonCons {
    String name;

    PersonCons() {
        System.out.println("This is Super class constructor");
    }

    public PersonCons(String name, int eID) {
        this.name = name;

    }
}

public class EmployeeCons extends PersonCons {
    int eID;

    EmployeeCons() {
        super();
    }

    EmployeeCons(String name, int eID) {
        super(name, eID);
        this.eID = eID;
    }

    public void display() {
        System.out.println("Emp-Name : " + name + " & EID  : " + eID);
    }

    public static void main(String[] args) {
        EmployeeCons a = new EmployeeCons();
        EmployeeCons b = new EmployeeCons("RAHUL", 13);
        EmployeeCons h = new EmployeeCons("Arun", 34);
        b.display();
        h.display();
    }
}
