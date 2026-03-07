import java.util.Arrays;

public class Array_Partition {
    public static void main(String[] args) {
        int ans[] ={6,2,6,5,1,2};
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
        
        int i = 0;
        int j = 1;
      int sum =0;
        while(j < ans.length){
           int min = Math.min(ans[i],ans[j]);
           sum = sum+min;
           i = i+2;
           j = j+2;
        }
        System.out.println(sum);
    }
}
