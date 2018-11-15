class Node {
	int data;
	Node next;
	Node(int data){
	this.data=data;
	this.next=null;
	}
}
public class LinkedList {
	Node head=null;
	public static void main(String args[]) {
	LinkedList l=new LinkedList();
	l.push(1);
	l.push(2);
	l.push(3);
	l.push(4);
	l.push(5);
	l.push(6);
	l.display();
	l.displaynthend(3);
	}
	void push(int data) {
	Node new_node=new Node(data);
	new_node.next=head;
	head =new_node;
	}
	void display(){
	Node temp=head;
	while(temp!=null){
	System.out.println(temp.data);
	temp=temp.next;
	}
	}
	void displaynthend(int n){
		Node temp1=head;
		Node temp2=head;
		while(temp1!=null && n>0){
			temp1=temp1.next;
			n--;
		}
		while(temp1!=null){
			temp1=temp1.next;
			temp2=temp2.next;
		}
		System.out.println("result");
		System.out.println(temp2.data);
	}
}