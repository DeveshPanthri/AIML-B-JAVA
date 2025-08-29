package UNIT_1;

public class CollegeStudent  extends student1{
    public CollegeStudent(String name,int rollno){
        super(name,rollno);


    }
    public void attend_class(){
        System.out.println( name+"Attending class on smart board");
    }
    public void give_exam(){
        System.out.println( name+"Giving exam on online mode ");
    }
}
