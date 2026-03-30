public class String_Compression {
    public static void main(String[] args) {
        StringBuilder Str = new StringBuilder();
        char chars[] = { 'a', 'b','c' };

        int length = compress(chars);
        System.out.println(length);
    }

    public static int compress(char[] chars) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        int i = 0;
        int n = chars.length;
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == chars[i]) {
                count++;
            } else if (chars[j] != chars[i]) {
                str = str.append(chars[i]);
                if (count > 1) {
                    str = str.append(count);
                }
                count = 1;
                i = j;
            }
            System.out.println(str.toString());
        }
       str.append(chars[i]);
       if(count>1){
        str.append(count);
       }
         
        for (int k = 0; k < str.length(); k++) {
            chars[k] = str.charAt(k);
        }
        return str.toString().length();
    }
}
