package Java100Ques.collection;

import java.util.Scanner;

public class Wiley33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // get input string
        char str1[] = str.toCharArray();
        int len = str.length();  // find length of the string
        int ans = -1, sz = 0;
        if (str1[len-1] >= '0' && str1[len-1] <= '9'){
            ans = str1[len-1]-'0';
            sz = str.length()-1;
            System.out.println(sz==ans*10+(sz%10)?(sz%10):(-1));
        }else {
            sz = str.length();
            System.out.println((sz > 9) ? (-1):(sz));
        }
}



}
