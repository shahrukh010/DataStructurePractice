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

    public static String reverse(String input){

        char[] charray = input.toCharArray();
        int length = charray.length-1;
        char[] reverse = new char[length+1];

        for(int i = length,j=0;i>=0;i--,j++)
            reverse[j] = charray[i];

            String string = String.valueOf(reverse);

            return string;
    }

    public static String secondWayReverse(String input){
        
        char[] chararray = input.toCharArray();
        int length = input.length()-1;

        for(int i =length , j = 0; i>=0;i--,j++){

            if(i>=j){
                char tmp = chararray[j];
                chararray[j] = chararray[i];
                chararray[i] = tmp;
            }
        }
        return String.valueOf(chararray);
    }

    public static boolean equal(String input1,String input2){
        
            char[] ch1 = input1.toCharArray();
            char[] ch2 = input2.toCharArray();
        for(int i=0,j=0;i !=ch1.length-1 && j !=ch2.length-1;i++,j++)
        {
             //here see if matching then not doing anything that's why skip if not matching then do something that's why write logic here
            if(ch1[i] !=ch2[j])
                return false;
        }
        return true;
    }

    public static boolean palindrome(String input){

        char[] ch = input.toCharArray();

        for(int i=0,j=ch.length-1;j>=i;i++,j--){

            if(ch[i] != ch[j])
                return false;
           }
           return true;
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
       System.out.println(reverse("annie"));

       System.out.println(secondWayReverse("annie"));
       System.out.println(equal("annie","annie"));;
       System.out.println(palindrome("madam"));
       System.out.println(palindrome("nitin"));
       System.out.println(palindrome("nic"));
    }
}



