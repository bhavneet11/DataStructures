package DataStructuresAndAlgorithms.BinaryTree;

public class MaxElementBinaryTree {

	public static void main(String[] args)
	{

		BinaryTreeNode binaryTreeNode1= new BinaryTreeNode(10);
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
		System.out.println(maxEleBinaryTree(binaryTreeNode1));
		System.out.println(maxElem(binaryTreeNode1));
	}
	public static int maxEleBinaryTree(BinaryTreeNode root)
	{
		int maxVal=Integer.MIN_VALUE;
		if(root!=null)
		{
			int leftMax=maxEleBinaryTree(root.left);
			int rightMax=maxEleBinaryTree(root.right);
			if(leftMax>rightMax)
			{
				maxVal=leftMax;
			}
			else if(rightMax>leftMax)
			{
				maxVal=rightMax;
			}
			if(root.data>maxVal)
			{
				maxVal=root.data;
			}
		}
		return maxVal;
		
	}
	public static int maxElem(BinaryTreeNode root)
	{
		int max=root.data;
		if(root.left!=null)
		{
			max=Math.min(root.data,maxElem(root.left));
		}
		else if(root.right!=null)
		{
			max=Math.min(root.data,maxElem(root.right));
		}
		return max;
	}
}
