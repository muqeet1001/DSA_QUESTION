public class First_and_Second_Smallests {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 3, 5, 6 };
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                secondsmall = small;
                small = arr[i];
            }
            if (arr[i] < secondsmall && arr[i] != small) {
                secondsmall = arr[i];
            }
        }
        System.out.println(small + " " + secondsmall);
    }
}
