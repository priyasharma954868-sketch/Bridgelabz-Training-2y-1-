package String.basics;

public class CountVowel {
    public static void main(String[] args) {
        String s = "india";
        String vowel = "aeiouAEIOU";
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(vowel.indexOf(s.charAt(i)) != -1 )
                count++;
        }

        System.out.println(count);
    }
}
