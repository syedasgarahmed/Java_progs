// Java program for checking
// balanced brackets
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {

        // function to check if brackets are balanced
        public static String isBalanced(String s) {
    // Write your code here\
    Stack<Character> stack = new Stack<>();
    String y = "YES";
    String n = "NO";
    for(int i = 0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(ch=='{'||ch=='('||ch=='['){
        stack.push(ch);
      }else if(stack.isEmpty()){
        return n;
      }
      else if(ch=='}'){
        if(stack.peek()=='{'){
          stack.pop();
        }
        else{return n;}
        
      }else if(ch==']'){
        if(stack.peek()=='['){
          stack.pop();
        }
        else{return n;}
           
      }else if(ch==')'){
        if(stack.peek()=='('){
          stack.pop();
        }
        else{return n;}
               
      }
    }
    if(!stack.isEmpty()){
      return n;
    }
    return y;
    

    }

        // Driver code
        public static void main(String[] args) throws IOException,NullPointerException
        {
                //String expr = "([{}])";
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String expr;
                int j=0;
                 Scanner scan = new Scanner(System.in);
                while(true)
                 {
                 String Line = new String(scan.nextLine());
                 if(Line.length()==0)
                 {
                      break;
                  }
                 // expr[j++]=Line;
                  
                  if (isBalanced(Line))
                        System.out.println("true");
                else
                        System.out.println("false");
                
				
				Line=null;
                 }
                //for(int i=0;i<3;i++){
                      //  expr[i]=br.readLine();
               // }
                // Function call
                //for(int i=0;i<expr.length;i++){
                        
                
                
                }
        }

