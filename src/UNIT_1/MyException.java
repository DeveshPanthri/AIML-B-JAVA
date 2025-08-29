package UNIT_1;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.*;
public class MyException {
    public static void main(String[] args)throws IOException {
        int x,y,z=0;
        DataInputStream dis=new DataInputStream(System.in);
        Scanner sc=new Scanner(System.in);
//        try{
        x=dis.readInt();
        y=dis.readInt();
        z=x/y;
        System.out.println("Exception not occured");}


//    catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//
//    }
//    catch(InputMismatchException e){
//            System.out.println(e);
//    }
//    finally{
//        System.out.println("the result is "+z);}
//    }
}
