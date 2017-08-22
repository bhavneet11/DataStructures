package DataStructuresAndAlgorithms.BinarySearchTree;

public class MinMaxElement 
{
	public static void main(String args[])
	{
		BinarySearchTreeNode bst1=new BinarySearchTreeNode(1);
		BinarySearchTreeNode bst2=new BinarySearchTreeNode(2);
		BinarySearchTreeNode bst3=new BinarySearchTreeNode(3);
		BinarySearchTreeNode bst4=new BinarySearchTreeNode(4);
		BinarySearchTreeNode bst5=new BinarySearchTreeNode(5);
		BinarySearchTreeNode bst6=new BinarySearchTreeNode(6);
		BinarySearchTreeNode bst7=new BinarySearchTreeNode(7);
		bst4.left=bst2;
		bst4.right=bst6;
		bst2.left=bst1;
		bst2.right=bst3;
		bst6.left=bst5;
		bst6.right=bst7;
		System.out.println(maxElement(bst4));
		System.out.println(minElement(bst4));
	}
	public static BinarySearchTreeNode minElement(BinarySearchTreeNode root)
	{
		if(root==null)
		{
			return null;
		}
		else
		{	
			if(root.left==null)
				return root;
			else return minElement(root.left);
		}	
	}
	public static BinarySearchTreeNode maxElement(BinarySearchTreeNode root)
	{
		if(root==null)
			return null;
		else if(root.right==null)
		{
			return root;
		}
		else
		return maxElement(root.right);
	}
}
