package Java100Ques.collection;

public class PrimeNum {
    public static void main(String[] args) {
        int no = 2, temp = 0;

        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp > 0) {
            System.out.println("The no is not prime");
        } else {
            System.out.println("The no is  prime");
        }

    }
}
