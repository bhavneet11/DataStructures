package DataStructuresAndAlgorithms.BinaryTree;


 
class LevelOrderTraversal1
{
    // Root of the Binary Tree
	BinaryTreeNode root;
 
    public LevelOrderTraversal1()
    {
        root = null;
    }
 
    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            printGivenLevel(root, i);
    }
 
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(BinaryTreeNode root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
 
    /* Print nodes at the given level */
    void printGivenLevel (BinaryTreeNode root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
     
    /* Driver program to test above functions */
    public static void main(String args[])
    {
    	LevelOrderTraversal1 lot=new LevelOrderTraversal1();
		lot.root= new BinaryTreeNode(1);
		lot.root.left= new BinaryTreeNode(2);
		lot.root.right = new BinaryTreeNode(3);
		lot.root.left.left= new BinaryTreeNode(4);
		lot.root.left.right= new BinaryTreeNode(5);
		lot.root.right.left= new BinaryTreeNode(6);
		lot.root.right.right= new BinaryTreeNode(7);
		
		
		System.out.println("Level order traversal of binary tree is ");
		lot.printLevelOrder();
       
    }
}
