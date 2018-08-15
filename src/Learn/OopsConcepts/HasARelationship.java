package Learn.OopsConcepts;

class Name {
    String Firstname;
    String Middlename;
    String Lastname;

    public Name(String fname, String mname, String lname) {
        this.Firstname = fname;
        this.Middlename = mname;
        this.Lastname = lname;
    }
}

public class HasARelationship {
    int age;
    Name n;

    public void display(int age, Name n) {
        System.out.println("Age : " + age);
        System.out.println("Full name : " + n.Firstname + " " + n.Middlename + " " + n.Lastname);
    }

    public static void main(String[] args) {
        HasARelationship e = new HasARelationship();
        Name n = new Name("Monica", "Mittal", "Agarwal");
        e.display(98, n);
    }

}
