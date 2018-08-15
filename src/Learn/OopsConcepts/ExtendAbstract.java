package Learn.OopsConcepts;

public class ExtendAbstract extends AbstractClass {
   private ExtendAbstract(String eName, String eAddress, int eID) {
        super(eName, eAddress, eID);
    }

    public void jobRole() {
        System.out.println("This is an abstract method");
    }

    public static void main(String[] args) {
        ExtendAbstract e = new ExtendAbstract("Rahul","Hacking",2948);
        e.department();
        e.jobRole();

    }
}
