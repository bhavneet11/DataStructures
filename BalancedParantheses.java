package DataStructuresAndAlgorithms.Stacks;

import java.util.Stack;

public class BalancedParantheses {

	public static void main(String[] args)
	{
		char ar[]={'{','a',')','}'};
		if(isBalanced(ar))
		{
			System.out.println("Balanced parantheses");
		}
		else
		{
			System.out.println("Unbalanced ");
		}
	}
	public static boolean mismatchparan(char c1,char c2)
	{
		if(c1=='('&&c2==')')
		{
			return true;
		}
		else if(c1=='{'&&c2=='}')
		{
			return true;
		}
		else if(c1=='['&& c2==']')
		{	
			return true;
		}
		else
		return false;
	}
	public static boolean isBalanced(char ar[])
	{
		Stack<Character> stk=new Stack<Character>();
		if(ar.length==0)
		{
			return false;
		}
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]=='('||ar[i]=='{'||ar[i]=='[')
			{
				stk.push(ar[i]);
			}
			if(ar[i]=='}'||ar[i]==']'||ar[i]==')')
			{
				if(stk.isEmpty())
				{
					return false;
				}
				else if(!mismatchparan(stk.pop(),ar[i]))
				{
					return false;
				}
			}
		}
		if(stk.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
