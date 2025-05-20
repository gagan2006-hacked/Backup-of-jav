import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo_link {
    public static void main(String[] args) {/*
//        LinkedList<Integer>link=new LinkedList<>();
//        ArrayList<Integer>list=new ArrayList<>(10);
//
//        System.out.printf("How number do u want enter in linked list");
//        int n=in.nextInt();
//        for (int i = 0; i < n; i++) {
//
//            link.add(in.nextInt());
//            System.out.printf("added");
//        }*/
//        Scanner in=new Scanner(System.in);
//        System.out.println("Do u want to hash ur password");
//
//        String ch=in.next();
//        System.out.printf("Enter the pass word you want to  hash ");
//        String []pass=new String[5];
//        pass[1]=in.next();
//        if (ch.equalsIgnoreCase("yes")||ch.equalsIgnoreCase("y")){
//            PasswordHashingWithSalt.main(pass);
//        }
//        System.out.println('1'-'0');
        dice("",4);
    }
    static void dice(String p ,int goal){
        if (goal==0){
            System.out.println(p);
            return;
        }if (goal>6)
            return;
        for (int i = 1; i <=goal ; i++) {
            dice(p+i,goal-i);
        }
    }
}
