package DataStructuresAndAlgorithms.Stacks;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args)
	{
		

	}
	public static String InfToPost(String s)
	{
		Stack<Character> st=new Stack<>();
		String result=new String("");
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				result+=c;
			}
			else if(c=='(')
			{
				st.push(c);
			}
			else if(c==')')
			{
				while(!st.isEmpty()&& st.peek()!='(')
					result+=st.pop();
				if(!st.isEmpty()&&st.peek()!='(')
					return "Invalid Expression";
			}
		}
		return s;
	}
}
