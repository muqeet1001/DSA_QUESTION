public class Consecutive_Characters {
    public static void main(String[] args) {
         String s = "abbccc";
          int i =0;
           
          for(int j =i+1;j<s.length();j++){
            if(s.charAt(i) != s.charAt(j)){
                i++;
            }
            else{
                j++;
            }
             System.out.println(j-i);
          }
          
    }
}
