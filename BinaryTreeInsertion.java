package DataStructuresAndAlgorithms.BinaryTree;

import java.util.Stack;

public class BinaryTreeInsertion 
{
	static int flag=0;

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
		
		
		insertNode(binaryTreeNode1,11);
		InOrderIterative(binaryTreeNode1);
		
	}
	public static BinaryTreeNode insertElement(BinaryTreeNode root, int data){
		if(root==null){
			
			
			if (flag==0){
				BinaryTreeNode node1 = new BinaryTreeNode(data);
				flag++;
				System.out.println(node1.data);
				return root;
				
			}
			else{
			return null;
		}
		}
		else{
			
			root.left=insertElement(root.left, data);
			System.out.print(root.data);
			root.right=insertElement(root.right, data);
		}
		return   root;
	}
	static void InOrderIterative(BinaryTreeNode root)
	{
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		BinaryTreeNode current=root;
		boolean done=false;
		while(!done)
		{
			if(current!=null)
			{
				stack.push(current);
				current=current.left;
			}
			else
			{
				if(stack.isEmpty())
				{
					done=true;
				}
				else
				{
					current=stack.pop();
					System.out.println(current.data);
					current=current.right;
				}
			}
		}
	}
	public static BinaryTreeNode insertNode(BinaryTreeNode root, int data) {

        if(root == null){
            root = new BinaryTreeNode(data);
            root.data = data;
            return root;
        }
        if(root.data < data) {
            root.right = insertNode(root.right,data);
        } else {
            root.left = insertNode(root.left, data);
        }
        return root;
    }
	public void insertionfinal(BinaryTreeNode root,int data)
	{
		if(root==null)
		{
			root=new BinaryTreeNode(data);
		}
		else
		{
			insertion(root, data);
		}
	}
	void insertion(BinaryTreeNode root,int data)
	{
		if(root.data>=data)
		{
			if(root.left==null)
			{
				root=new BinaryTreeNode(data);
			}
			else
			{
				insertion(root.left,data);
			}
		}
		else
		{
			if(root.right==null)
			{
				root=new BinaryTreeNode(data);
			}
			else
			{
				insertion(root.right,data);
			}
		}
	}
}

