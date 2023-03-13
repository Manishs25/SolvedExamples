package Java100Ques.collection;

public class ArraySorteeng {
    public static void main(String[] args) {

        int arr[] = {1, 35, 7, 7, 8, 9, 0, 65, 33};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
