package Java100Ques;

public class SmallestEle {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 8, 9, 0};
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
            System.out.println(min);
    }
}
