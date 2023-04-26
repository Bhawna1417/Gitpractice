package Binarytree;

import java.util.HashMap;
import java.util.Map;

public class ConvertBT_IN_postorder {
	//Map<Integer,Integer> map=new HashMap();
	
	public Node buildtree(int[] inorder,int[] postorder)
	
	{
		//for(int i=0;i<inorder.length,i++)
			
	//	map.put(inorder[i],i);
		return constreefrompostorder(inorder,postorder,0,inorder.length-1,postorder.length-1);
	}
	
	public Node constreefrompostorder(int [] inorder,int[] postorder,int start,int end,int index)
	{
		if(start>end)
			return null;
		Node root=new Node(postorder[index]);
		 int inrootindex=start;
		 while(postorder[index]!=inorder[inrootindex]) 
			 inrootindex++;
		 root.right=constreefrompostorder(inorder,postorder,inrootindex+1,end,index-1);
		 root.right=constreefrompostorder(inorder,postorder,start,inrootindex-1,index-(end-inrootindex));
		  return root;
		
	}

	public static void main(String[] args) 
	{
		int inorder[]= {9,3,15,20};
		int postorder[]= {9,15,7,20,3};
		
		// TODO Auto-generated method stub

	}

}
