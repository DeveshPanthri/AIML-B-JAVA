import java.util.*;
public class MyException {
    public static void main(String[] args) {
        int x,y,z=0;
        Scanner sc=new Scanner(System.in);
        try{
        x=sc.nextInt();
        y=sc.nextInt();
        z=x/y;
        System.out.println("Exception not occured");}


    catch(ArithmeticException e){
            System.out.println(e.getMessage());

    }
    catch(InputMismatchException e){
            System.out.println(e);
    }
    finally{
        System.out.println("the result is "+z);}
    }
}
