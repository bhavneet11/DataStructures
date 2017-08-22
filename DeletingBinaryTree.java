package DataStructuresAndAlgorithms.BinaryTree;

public class DeletingBinaryTree {

	public static void main(String[] args) 
	{
		 BinaryTreeNode tree = new BinaryTreeNode(1);
	        
	        tree.left = new BinaryTreeNode(2);
	        tree.right = new BinaryTreeNode(3);
	        tree.left.left = new BinaryTreeNode(4);
	        tree.left.right = new BinaryTreeNode(5);
	        BinaryTreeDeleting(tree
	        		);
		System.out.println(SizeBinaryTree(tree));
	}
	static void BinaryTreeDeleting(BinaryTreeNode root)
	{
		
		root=null;
	}
	public static int SizeBinaryTree(BinaryTreeNode root)
	{
		int size;
		if(root==null){
			return 0;
		}
		else{
			size=SizeBinaryTree(root.left)+1+SizeBinaryTree(root.right);
		}
		return size;
	}
}
