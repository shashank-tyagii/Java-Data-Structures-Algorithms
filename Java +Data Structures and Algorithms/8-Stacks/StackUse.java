package iStacks;

public class StackUse {
	
	public static void main(String[] args) throws StackFullException {
		
		bStackUsingLL stack = new bStackUsingLL();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.size());
		while (!stack.isEmpty()) {
			try {
				System.out.print(stack.pop() + " ");
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
