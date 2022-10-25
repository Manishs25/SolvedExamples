package Java100Ques;

public class SwapDemo {
    public static void main(String[] args) {
        int a = 10, b = 12, temp;
        System.out.println("Before swap : "+ a+ " " +b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swap : "+a+" "+b);
    }
}
