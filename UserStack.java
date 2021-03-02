package com.stack;
import java.util.Stack;

interface STACK{

    public boolean isBalance(String input);
}

public class UserStack {


    public boolean isBalance(String input){

        Stack<Character> s = new Stack<Character>();
        char top; 

        for(char ch : input.toCharArray()){

                    if(isLeftBracket(ch))
                        s.push(ch);

                 else if(isRightBracket(ch)){
                        
                            if(s.isEmpty())return false;

                                 top = s.pop();
                           if(!isBracketMatched(ch,top)){

                               return false;
                           }

                 }
        }
        if(s.isEmpty())
            return true;
        else
            return false;

    }
            private boolean isLeftBracket(char ch){

                return(ch =='{'|| ch=='('|| ch=='['|| ch=='<');
            }

            private boolean isRightBracket(char ch){

            return (ch == '}' || 
                    ch == ')' || 
                    ch == ']' || 
                    ch== '>');
            }

            private boolean isBracketMatched(char right,char left){

                if(
                    (right == '}' && left !='{')||
                    (right == ')' && left !='(')||
                    (right == ']' && left !='[')||
                    (right == '>' && left !='<')
                  )
                    return false;
               return true;
            }

}

