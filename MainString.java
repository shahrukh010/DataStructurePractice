import java.util.Arrays;
import java.util.HashMap;
class MainString{

    static HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
    static char again;

    public static String upperCase(String input){

        char[] ch = input.toCharArray();

        for(int i = 0; i < input.length(); i++)
            ch[i] = (char)(ch[i]-32);

            return String.valueOf(ch);

    }

    public static String toLowerCase(String input){

        char[] ch = input.toCharArray();
        for(int i=0;i<ch.length;i++)
            ch[i] = (char)(ch[i]+32);

            return (String.valueOf(ch));
    }

    public static void countWordsAndVowel(String input){
        
        int vowel = 0;
        int consonant = 0;
        int word  = 0;
        char[] chardata = input.toCharArray();

        for(int i = 0; i < chardata.length;i++){

            if(chardata[i] ==' ' && chardata[i-1] !=' ')
                ++word;
        }

        for(char ch : chardata){

            if(isVowelCharacterAvailable(ch))
                vowel++;
            else if(
            (ch>=65 && ch<=90)||
            (ch>=97 && ch<=122)
            )
                consonant++;
        }

        hashmap.put("word",word);
        hashmap.put("vowel",vowel);
        hashmap.put("consonant",consonant);

    }

    public static boolean isValid(String input){

        char[] string = input.toCharArray();
        boolean flag = false;

        for(char ch : string){
            if(valid(ch))
                flag = true;
            else
              flag = false;
        }
        if(flag)
            return true;
        else
            return false;
    }
    private static boolean valid(char ch){

        if(
            (ch >=65 && ch<=90)||
            (ch >=97 && ch<=122)
          )return true;
        else
            return false;
    }


    private static boolean isVowelCharacterAvailable(char ch){

        if(
            (ch=='a' || ch=='e')||
            (ch=='i' || ch=='o'|| ch=='u')||
            (ch=='A' || ch=='E')||
            (ch=='I' || ch=='O'|| ch=='U')
          )return true;
          else
              return false;
    }


    public static void main(String[]args){

       System.out.println(upperCase("annie"));
       System.out.println(toLowerCase("HECTOR"));

       countWordsAndVowel("Hector annie ");

       System.out.println(hashmap);
       System.out.println(isValid("annie123"));
    }
}



