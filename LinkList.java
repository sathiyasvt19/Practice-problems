class LinkList {
	static class Node {
		int data;
		Node link;
			Node(int data){
				this.data=data;
			}
	}
	Node head;
	public static void main(String args[]) {
		LinkList l=new LinkList();
		//l.head=new Node(1);
		//l.head.link=new Node(2);
        for(int i=0;i<10;i++)
        	l.push(i);
		l.printList();
	}
	void push(int data){
		Node temp=new Node(data);
		temp.link=head;
		head=temp;
	}
	void printList() {
		Node current =head;
		while(current!=null) {
			System.out.println(current.data);
			current=current.link;
		}
	}
}