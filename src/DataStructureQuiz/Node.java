package DataStructureQuiz;

/* Class containing left and right child of current
node and key value*/
class Node
{
 int key;
 Node left, right;

 public Node(int item)
 {
     key = item;
     left = right = null;
 }
}

//A Java program to introduce Binary Tree
class BinaryTree
{
 // Root of Binary Tree
 Node root;

 // Constructors
 BinaryTree(int key)
 {
     root = new Node(key);
 }

 BinaryTree()
 {
     root = null;
 }


     
     public static void main (String []args)
     {
    	 BinaryTree tre = new BinaryTree();
    	 tre.root=new Node(5);
    	 
    	 tre.root.left= new Node(3);
    	 tre.root.right=new Node(7);
    	 
     }
 }
