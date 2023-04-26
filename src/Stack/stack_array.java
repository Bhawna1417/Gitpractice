package Stack;

public class stack_array {

	int top=0;
	int max=4;
	int[] a=new int[max];
	
	public boolean isfull()
	{
		if(top==max)
		{
			return true;
	}
		return false;
		
	}
	
	public boolean isempty()
	{
		if (top==0)
		{
			System.out.println("stack is empty");
			return true;
		}
		System.out.println("stack is not empty");
		return false;
	}
	
	public void push(int val)
	{
		if (isfull())
		{
			System.out.println("stack is full");
			return;
		}
		else
		{
			//top++;
			a[top++]=val;
			System.out.println("stack is " +val);
		}
	}
	
	public void pop()
	{
		if(isempty())
		{		System.out.println("No item to be remove");
			return;
		}
		else
			top--;
		System.out.println("popped element "+a[top]);
	}
	
	public static void main(String[] args) 
	{
		stack_array st=new stack_array();
		st.push(4);
		st.push(3);
		st.push(7);
		st.push(2);
		st.push(6);
		System.out.println("------------------");
		st.pop();
		st.pop();
		System.out.println("--------------");
		st.push(10);
		st.isempty();

	}

}
