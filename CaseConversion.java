import java.util.*;
public class CaseConversion {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String input = sc.next();
		String res="";
		for(char c : input.toCharArray())
		{
			if (Character.isUpperCase(c))
			{
				res+="\n";
				res+=Character.toLowerCase(c);
				
			}
			else if (Character.isLowerCase(c))
			{
				res+=Character.toUpperCase(c);
			}
		}
        System.out.println(res);
    }
}
