import java.util.ArrayList;

public class Max_consecutive_One_hard {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,0,0};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                list.add(i);
        }
        System.out.println(list);
         int max = 0;
         for(int i =0;i<list.size();i++){
            arr[(list.get(i))] = 1;
            max  = Math.max(max, Max_consecutive_One(arr));
            arr[(list.get(i))] = 0;

         }
         System.out.println(max);
        
    }
    public static int Max_consecutive_One(int []arr){
         int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }

        }
        return max;
    }
}