package Generic;

import java.util.ArrayList;

public class EmpComparator {
    public static void main(String[] args) {
        ArrayList<Emps> a1 = new ArrayList<>();
        a1.add(new Emps("Rahul", 22));
        a1.add(new Emps("Arun", 21));
        a1.add(new Emps("Ananthu", 19));
        a1.add(new Emps("Sibin", 21));
        a1.add(new Emps("Midhun", 99));
        a1.sort(new AgeComparator());
        for (Emps e : a1) {
            System.out.println(e.name + " " + e.age);
        }


    }
}
