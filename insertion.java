package DataStructuresAndAlgorithms.BinarySearchTree;



public class insertion {

	public static void main(String[] args) {
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
		insertionfinal(bst1,11);
		BinaryTreeSearchElementRecursion btsr=new BinaryTreeSearchElementRecursion();
		btsr.findElementIterative(bst1,11);
	}
	public static void insertionfinal(BinarySearchTreeNode root,int data)
	{
		if(root==null)
		{
			root=new BinarySearchTreeNode(data);
		}
		else
		{
			insertionTree(root, data);
		}
	}
	static void insertionTree(BinarySearchTreeNode root,int data)
	{
		if(root.data>=data)
		{
			if(root.left==null)
			{
				root=new BinarySearchTreeNode(data);
			}
			else
			{
				insertionTree(root.left,data);
			}
		}
		else
		{
			if(root.right==null)
			{
				root=new BinarySearchTreeNode(data);
			}
			else
			{
				insertionTree(root.right,data);
			}
		}
	}
}
