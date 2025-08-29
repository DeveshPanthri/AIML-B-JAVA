package UNIT_1;

public class student {
    int roll_no;//(instance variable)
    String name;//(instance variable)
    student(){
        System.out.println(" I am default constructor ");
    }
    // constructor
    student (int r,String n){
        roll_no=r;
        name=n;
    }
    student(student s){
        roll_no=s.roll_no;
        name=s.name;
    }
    public void display(){
        System.out.println("Roll No : "+roll_no);
        System.out.println("Name is  : "+name);
    }
}
