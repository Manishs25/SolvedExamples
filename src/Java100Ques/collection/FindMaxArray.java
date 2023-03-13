package Java100Ques.collection;

public class FindMaxArray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,533,6,7,4,2};
        int max = arr[0];

        for (int i : arr){
            if (i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
}
