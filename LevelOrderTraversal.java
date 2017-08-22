package DataStructuresAndAlgorithms.BinaryTree;

public class LevelOrderTraversal 
{
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
		
	}
	public int height(BinaryTreeNode root)
	{
		int lheight,rheight;
		if(root==null)
		return 0;
		else
		{
			lheight=height(root.left);
			rheight=height(root.right);
		}
		if(lheight>rheight)
		return (rheight+1);
		else
		{
			return (rheight+1);
		}
		
	}
	 void printGivenLevel(BinaryTreeNode root,int level)
	{
			if(root==null)
			{
				return;
			}
			if(level==1)
			{
				System.out.println(root.data);
			}
			else if(level>1)
			{
				printGivenLevel(root.left,level-1);
				printGivenLevel(root.right,level-1);
			}
	}
	 
	
}

