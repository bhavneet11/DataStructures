package DataStructuresAndAlgorithms.BinarySearchTree;

import java.util.LinkedList;
import java.util.Stack;

import java.util.Queue;

public class SearchElementNonRecursive 
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
		bst1.left=bst2;
		bst1.right=bst3;
		bst2.left=bst4;
		bst2.right=bst5;
		bst3.left=bst6;
		bst3.right=bst7;
		if(SearchElement(bst1,7))
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}
	public static boolean SearchElement(BinarySearchTreeNode root, int data) {
		if (root != null) {
			Queue<BinarySearchTreeNode> q = new LinkedList<>();
			// add root to the queue
			q.add(root);
			while (!q.isEmpty()) {
				BinarySearchTreeNode n = q.poll();
				// check if current node has the element we are looking for
				if (n.data == data) {
					return true;
				}
				// add children to the queue
				if (n.left != null) {
					q.add(n.left);
				}
				if (n.right != null) {
					q.add(n.right);
				}
			}
			// if reached here, means we have not found the element
			return false;
		}
		// if root is null, return false
		return false;
	}
}
