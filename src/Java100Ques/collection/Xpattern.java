package Java100Ques.collection;

import java.util.Scanner;

public class Xpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int i,j,k =1;
        for ( i =1; i<=(2*rows)-1;i++)
        {
            for ( j = 1; j<=(2*rows)-1;j++)
            {
                if (i==j || i+j == 2*rows)
                {
                    System.out.print(k);
                }
                else
                {
                    System.out.print(" ");
                }}
            if (i<rows)
            {
                k++;
            }
            else
            {
                k--;
        }
                System.out.println();
        }
    }
}
