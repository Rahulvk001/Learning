package Learn.OopsConcepts;

public class EncapsulationDemo {
    private String name;
    private int rollno;
    String subject;
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        EncapsulationDemo s = new EncapsulationDemo();
        s.setName("Rahul");
        System.out.println(s.getName());
        System.out.println(s.rollno = 20);
    }
}
