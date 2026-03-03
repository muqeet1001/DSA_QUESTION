import java.util.Arrays;

public class Left_and_Right_Sum_Differences {
    public static void main(String[] args) {
        int nums[] = { 10, 4, 8, 3 };
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        int result[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0)
                leftSum[i] = 0;
            else {
                for (int l = 0; l < i; l++) {
                    sum += nums[l];
                }
                leftSum[i] = sum;
                sum =0;
            }
            if(i==n-1)
                rightSum[i] =0;
            else{
                for(int r =i+1;r<n;r++){
                  sum+=nums[r];
                }
                rightSum[i] = sum;
                sum =0;
            }

            result[i] = (leftSum[i]-rightSum[i]);
           

        }
        System.out.println(Arrays.toString(result));

    }

}
