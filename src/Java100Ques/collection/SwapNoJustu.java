package Java100Ques.collection;

public class SwapNoJustu {
    public static void main(String[] args) {
        int a = 90, b = 99;
        System.out.println("Before swapping : " + a + " " + b);

        a = a + b; //90+99=189
        b = a - b; //189-99=90 b = 90
        a = a - b; //189-90=99  a = 99

        System.out.println("After swapping : "+a+" "+b);
    }
}
