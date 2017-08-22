package DataStructuresAndAlgorithms.BinarySearchTree;

public class Successor 
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
	}
//	public static BinarySearchTreeNode successor(BinarySearchTreeNode root)
//	{
//		if(root==null)
//			return null;
//		//else if()
//		successor(root.right);
//		successor(root.left);
//	}
}
