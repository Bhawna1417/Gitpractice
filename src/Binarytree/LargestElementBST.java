package Binarytree;

class Node 

	{
		int data;
		Node left = null, right = null;

		Node(int data) {
			this.data = data;
		}
	}

	public class LargestElementBST
	{
		public static Node insert(Node root, int key)
		{
			if (root == null) {
				return new Node(key);
			}

			if (key < root.data) {
				root.left = insert(root.left, key);
			}

			else {
				root.right = insert(root.right, key);
			}

			return root;
		}

		public static int kthLargestBST(Node root, AtomicInteger i, int k)
		{
		    //Write Your Code Here
		    return 0;
		}

		public static int kthLargestBST(Node root, int k)
		{
			AtomicInteger i = new AtomicInteger(0);

			return kthLargestBST(root, i, k);
		}

		public static void main(String[] args)
		{
			Node root = null;
			int[] keys = { 13, 14, 22, 25, 23, 32, 26,28,40};

			for (int key : keys) {
				root = insert(root, key);
			}

			int k = 3;
			int res = kthLargestBST(root, k);

			if (res != Integer.MAX_VALUE) {
				System.out.print(res);
			}
			else {
				System.out.print("Invalid Input");
			}
		}
	}