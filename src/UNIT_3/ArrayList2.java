package UNIT_3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        System.out.println("Please enter the number of products you want to add: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            products.add(sc.nextLine());
        }
        Iterator itr = products.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        products.add(1,"Apple");
        products.addLast("Banana");
        products.addFirst("orange");
        System.out.println(products.get(1));


    }
}
