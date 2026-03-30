public class Merge_Strings_Alternately {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        String word1 = "abcd";
        String word2 = "pq";
        int i = word1.length();
        int j = word2.length();
        int n = Math.max(i, j);
        int p = 0;
        int q = 0;
        while(n>0){
          if(p<i){
             s.append(word1.charAt(p));
             p++;
          }
           else if(p>i && q<j){
            s.append(word2.charAt(q));
            q++;
          }
          if(q<j){
            s.append(word2.charAt(q));
            q++;
          }
           else if(q>j && p<i){
            s.append(word1.charAt(p));
            p++;
          }
          n--;
        }
        System.out.println(s.toString());

    }
}
