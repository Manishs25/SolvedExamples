package Java100Ques.collection;

public class Facto {
    public static void main(String[] args) {
         int no = 7, fact = 1;

        for (int i=1;i<=no;i++){
            fact = fact * i;
        }
        System.out.println("Factorial of a given no is : "+fact);
    }
}
