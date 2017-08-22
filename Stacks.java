package DataStructuresAndAlgorithms.Stacks;

public class Stacks
{
	int cap=100;
	int []stackspace=new int[cap];
	int top;
	boolean isEmpty()
	{
		return (top<0);
	}
	Stacks()
	{
		top=-1;
	}
	int size()
	{
		return top+1;
	}
	boolean push(int data)
	{
		if(top>=cap)
		{
			System.out.println("Stack is full");
			return false;
		}
		else
		{
			stackspace[++top]=data;
			return true;
		}
		
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		{
			return stackspace[top--];
		}	
	}
}