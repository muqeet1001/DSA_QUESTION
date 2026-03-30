 public class Adding_spaces_to_a_String {
public static void main(String[] args) {
    StringBuilder Str = new StringBuilder();
    String s = "LeetcodeHelpsMeLEarn";
    int [] spaces = {8,13,15};
    int n = s.length();
    int j =0;
    for(int i =0;i<n;i++){
       if(j<spaces.length && i==spaces[j] ){
        Str = Str.append(" ");
         j++;
       }
        Str = Str.append(s.charAt(i));
       
    }

System.out.println(Str.toString());
}
    
}