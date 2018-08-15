
package Learn.OopsConcepts;
public abstract class AbstractClass{
    String eName;
    String eAddress;
    int eID;

    public AbstractClass(String eName, String eAddress, int eID) {
        this.eName = eName;
        this.eAddress = eAddress;
        this.eID = eID;
    }
    public abstract void jobRole();
    public void department(){
        System.out.println("This enployee works for L&D Department");
    }
}
