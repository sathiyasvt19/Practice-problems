	class StackArray {
		static final int MAX=10;
		int top;
		String[] name=new String[MAX];
		public static void main(String args[]) {
			StackArray st=new StackArray();
			st.push("sathiya");
			st.push("raj");
			st.push("sathiyaraj");
			System.out.println(st.peek());
			System.out.println(st.pop());
			System.out.println(st.peek());
		}
		StackArray() {
			top=-1;
		}
		boolean isEmpty() {
			return (top<0);
		}
		void push(String data) {
			if(top>=MAX)
				System.out.println("Overflow");
			else 
				name[++top]=data;
		}
		String peek() {
			if(top<0){
				System.out.println("underflow");
				return null;
			}
			else
				return name[top];
		}
		String pop(){
			if(top<0){
				System.out.println("underflow");
				return null;
			}
			else
				return name[top--];
		}
	}