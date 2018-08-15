package Learn.OopsConcepts;

public class ImplementInterface implements MathTeacher {
    public static void main(String[] args) {
        ImplementInterface obj = new ImplementInterface();
        obj.department();
        obj.jobRole();
        obj.subject();
        obj.division();
    }


    public void department() {
        System.err.println("Teaching");
    }


    public void jobRole() {
        System.out.println("Maths teacher");

    }


    public void subject() {
        System.out.println("Maths");

    }


    public void division() {
        System.out.println("Algebra");

    }
}
