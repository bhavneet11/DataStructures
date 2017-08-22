package DataStructuresAndAlgorithms.BinaryTree;
import java.util.ArrayList;
import java.util.Stack;
public class InOrderIterative {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		BinaryTreeNode binaryTreeNode1= new BinaryTreeNode(1);
		BinaryTreeNode binaryTreeNode2= new BinaryTreeNode(2);
		BinaryTreeNode binaryTreeNode3= new BinaryTreeNode(3);
		BinaryTreeNode binaryTreeNode4= new BinaryTreeNode(4);
		BinaryTreeNode binaryTreeNode5= new BinaryTreeNode(5);
		BinaryTreeNode binaryTreeNode6= new BinaryTreeNode(6);
		BinaryTreeNode binaryTreeNode7= new BinaryTreeNode(7);
		binaryTreeNode1.left=binaryTreeNode2;
		binaryTreeNode1.right=binaryTreeNode3;
		binaryTreeNode2.left=binaryTreeNode4;
		binaryTreeNode2.right=binaryTreeNode5;
		binaryTreeNode3.left=binaryTreeNode6;
		binaryTreeNode3.right=binaryTreeNode7;
		InOrderIterative(binaryTreeNode1);
	}
	static void InOrderIterative(BinaryTreeNode root)
	{
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		BinaryTreeNode current=root;
		boolean done=false;
		while(!done)
		{
			if(current!=null)
			{
				stack.push(current);
				current=current.left;
			}
			else
			{
				if(stack.isEmpty())
				{
					done=true;
				}
				else
				{
					current=stack.pop();
					System.out.println(current.data);
					current=current.right;
				}
			}
		}
	}
}
