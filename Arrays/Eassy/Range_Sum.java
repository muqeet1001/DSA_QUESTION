import java.lang.reflect.Array;
import java.util.Arrays;

public class Range_Sum{
    public static void main(String[] args) {
        int arr[] = {2,3,5,2,-5,1,4};
        int sum[] = new int[arr.length];
        sum[0] = arr[0];
        for(int i =1;i<arr.length;i++){
            sum[i] = arr[i]+sum[i-1];
        }
        System.out.println(range(3, 5, sum));

    }
    public static int range(int i ,int j,int []sum){
        int result = sum[j]-sum[i-1];
        return result;
    }
}