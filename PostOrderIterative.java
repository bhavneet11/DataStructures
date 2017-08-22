package DataStructuresAndAlgorithms.BinaryTree;

import java.util.Stack;

public class PostOrderIterative {

	public static void main(String[] args) 
	{

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
		PostOrderTraversal(binaryTreeNode1);

	}
	static void PostOrderTraversal(BinaryTreeNode root)
	{
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		if(root==null)return;
		stack.push(root);
		BinaryTreeNode prev=null;
	while(!stack.isEmpty())
	{
		BinaryTreeNode current=stack.peek();
		if(prev==null||prev.left==current||prev.right==current)
		{
			if(current.left!=null)
			{
				stack.push(current.left);
			}
			else if(current.right!=null)
			{
				stack.push(current.right);
			}
			else
			{
				stack.pop();
				System.out.println(current.data);
			}
		}
		else if(current.left==prev)
		{
			if(current.right!=null)
			{
				stack.push(current.right);
			}
			else
			{
				stack.pop();
				System.out.println(current.data);
			}
		}
		else if(current.right==prev)
		{
			stack.pop();
			System.out.println(current.data);
		}
		prev=current;
		
	}
		
	}

}
