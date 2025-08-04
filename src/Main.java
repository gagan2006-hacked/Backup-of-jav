

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(gcd(1,18));
    }


public static int gcd(int a, int b){
    if(a==0){
        return b;}
    return gcd(b%a,a);
    }
}
