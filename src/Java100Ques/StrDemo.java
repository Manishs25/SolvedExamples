package Java100Ques;

public class StrDemo {
    public static void main(String[] args) {
//        string reverse
//        String str = "Manish";
//        char[] ch = str.toCharArray();
//
//        for (int i = str.length()-1;i>=0;i--){
//            System.out.print(ch[i]);
//        }


//        array reverse

//
//        int arr[] = {23, 545, 7, 889, 9, 0, 55, 0};
//        System.out.println("og");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//        System.out.println("new");
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.print(arr[i] + "\t");
//        }


        //Array sorting
        int arr1[] = {1, 3, 44, 68, 9, 0, 4, 55, 2, 5, 7};
        int temp = 0;
        for (int i=0;i<arr1.length;i++) {
            for (int j=i+1;j<arr1.length;j++){
                if (arr1[i]>arr1[j]){
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
            System.out.print(arr1[i]+" ");
        }
    }
}
