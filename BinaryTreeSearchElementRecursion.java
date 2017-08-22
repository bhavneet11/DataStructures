package DataStructuresAndAlgorithms.BinarySearchTree;

public class BinaryTreeSearchElementRecursion {

	public static void main(String[] args)
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
		if(FindElementRecursive(bst4, 5))
		{
			System.out.println("Element found");
		}
		else{
			System.out.println("Element not found");
		}
		System.out.println(findElementIterative(bst4, 5));
	}
	public static boolean FindElementRecursive(BinarySearchTreeNode root,int data)
	{
		
		if(root==null)
			return false;
		else
		{
		if(root.data==data)
			{
				return true;
			}
			else
				return FindElementRecursive(root.left,data)||FindElementRecursive(root.right,data);
				
		
		}
			
		
		
	}
	public static BinarySearchTreeNode findElementIterative(BinarySearchTreeNode root,int data)
	{
		if(root==null)
		{
			
			return root;
		}
		while(root!=null)
		{
			if(root.data==data)
			{
				System.out.println("Element found");
				return root;
			}
			else if(root.data>data)
			{
				root=root.right;
			}
			else
			{
				root=root.left;
			}
		}
		return null;
	
	}
}
