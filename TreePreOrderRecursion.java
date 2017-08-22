package DataStructuresAndAlgorithms.BinaryTree;
import java.util.ArrayList;
import java.util.Stack;
import static java.lang.System.out;
public class TreePreOrderRecursion {

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
		/*System.out.println("PreOrder Traversal:");
		preOrder(binaryTreeNode1);
		System.out.println("\nPostOrder traversal:");
		postOrder(binaryTreeNode1);
		System.out.println("\nInOrder traversal:");
		inOrder(binaryTreeNode1);
		*/
		out.println("IterativePreOrder:");
		preOrderTraversal(binaryTreeNode1);
		out.println("IterativePreOrder: Array list");
			
	
		iterativePreOrder(binaryTreeNode1);
		System.exit(0);
				
	}
	//recursive traversals
	static void preOrder(BinaryTreeNode root)
	{
		if(root!=null)
		{
			System.out.print(root.data);
			preOrder(root.left);
			preOrder(root.right);
			
		}
		
	}
	static void postOrder(BinaryTreeNode root)
	{
		
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data);
		}
		
	}
	static void inOrder(BinaryTreeNode root)
	{
		
		if(root!=null)
		{
			inOrder(root.left);
			
			System.out.print(root.data);
			inOrder(root.right);
		}
		
	}//recursive traversal ends
	
	//Iterative traversal begin
	static void iterativePreOrder(BinaryTreeNode root)
	{
		if(root==null)
			return;
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			root=stack.pop();
			System.out.println(root.data);
			if(root.right!=null)
			{
				stack.push(root.right);
			}
			if(root.left!=null)
			{
				stack.push(root.left);
			}
		}
	}
		public static void preOrderTraversal(BinaryTreeNode root)
		{
			ArrayList<Integer> alist=new ArrayList<Integer>();
			if(root==null)
				return ;
			Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
			stack.push(root);
			while(!stack.isEmpty())
			{
				root=stack.pop();
				alist.add(root.data);
				if(root.right!=null)
				{
					stack.push(root.right);
				}
				if(root.left!=null)
				{
					stack.push(root.left);
				}
				
			}
			
			
			for(Integer integer: alist)
				out.println(integer);
			return ;
			
		}
	}
	

