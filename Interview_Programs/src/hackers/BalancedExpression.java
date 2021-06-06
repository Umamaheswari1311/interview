package hackers;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class BalancedExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Expression:");
		System.out.println(checkBalanced(sc.next()));
		
	}
public static boolean checkBalanced(String str)
{
	HashMap <Character,Character> hmap=new HashMap<Character,Character>();
	hmap.put('(', ')');
	hmap.put('{', '}');		
	hmap.put('[',']');
	if(str.length() % 2 ==1)
	{
		return false;
	}
	char [] ch=str.toCharArray();
	Stack<Character> st=new Stack<Character>();
	
	for(char c : ch)
	{
		if(hmap.containsKey(c))
		{
			st.push(c);
		}
		
		else if(st.isEmpty()||hmap.get(st.pop())!=c)	
		{
			return false;
		}
	}

	return st.isEmpty()?true:false;
	
}
}
