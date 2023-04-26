package Binarytree;

/*package whatever //do not write package name here */




public class GfG
{
    Node root;
    class Node
    {
        int data;
        Node left;
    Node right;
    
        Node(int data1)
        {
            this.data=data1;
        }
    }
    
    public void create()
    { 
    	Node top=new Node(5);
        Node first=new Node(1);
        Node second=new Node(2);
        Node three=new Node(3);
        
    root=top;
    
    top.left=second;
    top.right=first;
    first.left=three;
        
    }
    
    public void preorder(Node root)
    {
        if(root==null)
        {
        return;
        }
      //  System.out.println("Hi ");
        System.out.println(root.data+ " ");
        preorder(root.left);
        preorder(root.right);
    }
    



	public static void main (String[] args) {
	    GfG bt=new GfG();
	    bt.create();
	    bt.preorder(bt.root);
		System.out.println("GfG!");
	}

}
