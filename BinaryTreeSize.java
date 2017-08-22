package DataStructuresAndAlgorithms.BinaryTree;

public class BinaryTreeSize 
{
	public static void main(String args[])
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
		System.out.println("Size of the Binary Tree:"+SizeBinaryTree(binaryTreeNode1));
	}
	public static int SizeBinaryTree(BinaryTreeNode root)
	{
		int size;
		if(root==null)
			return 0;
		else{
			size=SizeBinaryTree(root.left)+1+SizeBinaryTree(root.right);
		}
		return size;
	}
}
