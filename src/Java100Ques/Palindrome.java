package Java100Ques;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int r, sum=0,temp;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        temp=n;

        while (n>0){
            r = n%10;
            sum = (sum*10)+r;
            n = n/10;
        }if (temp == sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
