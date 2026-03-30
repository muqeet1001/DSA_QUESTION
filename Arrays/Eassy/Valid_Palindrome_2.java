public class Valid_Palindrome_2 {
    public static void main(String[] args) {
        String s = "abca";
         int i = 0;
         int j = s.length()-1;
         while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else {
                if(isPalindrome(s, i+1, j)||isPalindrome(s, i, j-1)){
                    System.out.println("valid");
                    return;
                }else{
                    System.out.println("not valide");
                    return;
                }
            }
         }
    }

    public static boolean isPalindrome(String s, int start, int end) {

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}
