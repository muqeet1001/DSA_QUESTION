 import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int digits[] = {1,3,9};

        int n = digits.length;

        for(int i = n - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }

        int ans[] = new int[n + 1];
        ans[0] = 1;

        System.out.println(Arrays.toString(ans));
    }
}