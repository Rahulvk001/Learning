package Learn;

interface Persons{
    public void department();
   public void jobRole();

}

public class Employees implements Persons{

    public void department(){
        System.out.println("Department : High Level Language");
    }
  public   void jobRole(){
      System.out.println("Job : Hacker");

    }

    public static void main(String[] args) {
        Employees s = new Employees();
        s.department();
        s.jobRole();
    }
}
