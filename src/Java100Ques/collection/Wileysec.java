package Java100Ques.collection;

import java.util.Scanner;

public class Wileysec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s1 = sc.next();
       String s2 = sc.next();

       int min= 0, max = 0;

       for (int i = 0; i< s1.length();i++){
           if (s1.charAt(i)== '?' || s2.charAt(i)=='?'){
               max = max+1;
           } else if (s1.charAt(i)!= s2.charAt(i)) {
               min = min +1;
               max = max+1;
           }
       }
        System.out.println(min+" "+max);
    }
}
