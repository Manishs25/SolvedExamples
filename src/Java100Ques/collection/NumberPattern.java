package Java100Ques.collection;

public class NumberPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j < i + 1; j += 2) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
