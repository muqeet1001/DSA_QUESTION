public class Pick_from_Both_Sides {
    public static void main(String[] args) {
        int [] A = {1,2};
        int B = 1; 
        int result = solve(A, B);
        System.out.println(result);
    }
    public static int solve(int[] A, int B) {

    int n = A.length;

    int sum = 0;

    for (int i = 0; i < B; i++) {
        sum += A[i];
    }

    int max = sum;

    for (int i = 1; i <= B; i++) {

        sum = sum - A[B - i] + A[n - i];

        max = Math.max(max, sum);
    }
    return max;
}
}
