public class Valid_word_Abbrevation {

    public static void main(String[] args) {
        String word = "abbreviation";
        String abbr = "abbreviation";
        System.out.println(validWordAbbreviation(word,abbr));
    }
    public  static boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        int n = word.length();
        while(i<n){
            if(word.charAt(i)==abbr.charAt(j)){
                i++;
                j++;
            }
            else{
                int num = Integer.parseInt(String.valueOf(abbr.charAt(j)));
                while(i<=num){
                  i++;
                }
                j++;
                if(word.charAt(i)!=abbr.charAt(j)){
                    System.out.println(word.charAt(i));
                    System.out.println(abbr.charAt(j));
                    return false;
                }
            }
        }
        return true;
    }
}   

