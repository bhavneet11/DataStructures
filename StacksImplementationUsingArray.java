package DataStructuresAndAlgorithms.Stacks;

public class StacksImplementationUsingArray
{
	public static void main(String args[])
	{
		Stacks st=new Stacks();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		if(!st.isEmpty())
		{
			System.out.println("Not empty");
		}
		System.out.println(st);
		
		
	}
	
	
}
