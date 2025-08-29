package UNIT_1;

public class MyMain {
    public static void main(String[] args) {
//        UNIT_1.student s1=new UNIT_1.student();//noramal method
//               s1.name="Devesh";
//        s1.roll_no=80;

        //constructor
        student s1=new student(20,"Devansh");
        student s2=new student(s1);

        s1.display();
        s2.display();
    }
}

